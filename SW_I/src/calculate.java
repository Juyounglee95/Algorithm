import java.util.*;
public class calculate {
	static int N;
	static int[] num_set;
	static int[] op_set; //+,-,*,/
	static boolean[] visit;
	static int max=Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	public static void main (String abc []) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		num_set = new int[N];
		op_set = new int[N-1];
		visit = new boolean[N-1];
		for(int i=0; i<N; i++) {
			num_set[i]= scan.nextInt();
		}
		int idx =0;
		for(int i=0; i<4; i++) {
			int k = scan.nextInt();
			for(int j =0; j<k; j++) {
				op_set[idx++] = i+1;
			}
			//op_set[i]= scan.nextInt();
		}
		dfs(0,1, num_set[0], 0);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void dfs(int v, int nx, int result, int len) {
	int answer =0;
	if(len==N-1) {	
		if(max<result) {
			max = result;
		}
		if(min> result) {
			min = result;
		}
	}else {
		for(int i=0; i<N-1; i++) {
			if(!visit[i]) {
				switch(op_set[i]) {
				case 1:
					answer = result + num_set[nx];
					break;
				case 2:
					answer = result - num_set[nx];
					
					break;
				case 3:
					answer = result * num_set[nx];
					
					break;
				case 4:
					answer = result / num_set[nx];
					
					break;
				
				
				}
				
				visit[i]= true;
				dfs(i, nx+1, answer, len+1);
			}
		}
		
		}
	visit[v]= false;
	}
}
