import java.util.*;
public class soccer {
	static int skill[][];
	static boolean selected[];
	static int min = Integer.MAX_VALUE;
	static int N;
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		skill = new int[N][N];
		selected = new boolean[N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				skill[i][j] = sc.nextInt();
			}
		}
		
		dfs(0,0);
		System.out.println(min);
	}
	
	public static void dfs(int v, int len) { //dfs
		if(N/2 ==len) {
			calculate();
		}
		else {
			for(int i= v;i<N; i++ ) {
				if(!selected[i]) {
					selected[i]=true;
					dfs(i, len+1);
				}
			}	
		}
		selected[v]= false;
	}
	
	
//	public static void pushteam() {
//		
//		
//	}
	public static void calculate() {
		int smart[] = new int [N/2];
		int link[] = new int[N/2];
		int s =0; 
		int l=0;
		int s_score =0;
		int l_score=0;
		for(int i=0; i<N; i++) {
			if(selected[i]) {
				smart[s++]= i;
			}else {
				link[l++]=i;
			}
		}
		for(int k=0; k<N/2; k++) {
			for(int j=0; j<N/2; j++) {
				s_score+=skill[smart[k]][smart[j]];
				l_score+=skill[link[k]][link[j]];
			}
		}
		int dif = Math.abs(s_score-l_score);
		if(dif<min) {
			min = dif;
		}
	}
}
