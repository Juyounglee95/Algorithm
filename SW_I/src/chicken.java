import java.util.*;
public class chicken {
	static int N;
	static int M;
	static int min= Integer.MAX_VALUE;
	static int map[][];
	static int h_r[], h_c[]; 
	static int c_r[], c_c[];
	static int home=0, chicken=0;
	static boolean selected[];
	static int num;
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map= new int[N][N];
		num = N*N;
		h_r= new int[num];
		c_r= new int[num];
		h_c= new int[num];
		c_c= new int[num];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N ; j++) {
				int a= sc.nextInt();
				map[i][j]=a;
				if(a==1) {
					h_r[home]=i;
					h_c[home]=j;
					home++;
				}else if(a==2) {
					c_r[chicken]=i;
					c_c[chicken]=j;
					chicken++;
				}
			}
		}//map ют╥б
		selected = new boolean[chicken];
		select(0,0);
		System.out.println(min);
		
	}
	
	public static void select(int cur,int selnum) {
		if(selnum ==M) {
			calculate();
		}else {
			for(int i=cur; i<chicken; i++) {
				if(!selected[i]) {
					selected[i]=true;
					select(i,selnum+1);
				}
			}
		}
		selected[cur]= false;
	}
	public static void calculate() {
		int answer=0;
		
		for(int i=0; i<home; i++) {
			int min_h=Integer.MAX_VALUE;
			int dis=0;
			for(int j=0; j<chicken; j++) {
				if(selected[j]==true) {
					dis=(Math.abs(h_r[i]-c_r[j]))+(Math.abs(h_c[i]-c_c[j]));
					if(dis<min_h) {
						min_h= dis;
					}
				}
			}
			answer+=min_h;
		}
		if(answer<min) {
			min=answer;
		}
		
	}
}
