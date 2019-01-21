import java.util.*;
public class history {
	static int N; //사건의 개수
	static int K; //전후 관계의 개수
	static int[][] table;
	public static void main(String abcd[]) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		table= new int[N][N];
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				
//				table[i][j]=50000;
//				
//			}
//		}
		K=scan.nextInt();
		for(int i=0;i<K; i++) {
			int first = scan.nextInt();
			int second = scan.nextInt();
			
			table[first-1][second-1]=-1;
			table[second-1][first-1]=1;
		
		}
		floyd();
		int case_num = scan.nextInt();
		
		for(int i=0; i<case_num; i++) {
			int a = scan.nextInt();
			int b= scan.nextInt();
			System.out.println(table[a-1][b-1]);
		}

		
		
		
		
	}
	
	public static void floyd() {
		//int answer =0;
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if((table[i][k]==-1||table[i][k]==1)&&table[i][k]==table[k][j]) {
					table[i][j] = table[i][k];
					
					}
			
					}
				}
			}
	}
}
