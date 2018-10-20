import java.util.*;
public class number {
	static int num[]= new int[11];
	static int opset[]= new int [10];
	static boolean visit[]= new boolean[10];
	static int numset;
	static int result, max =Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		
		numset = sc.nextInt();
		
		for( int i=0; i< numset; i++) {
			num[i]= sc.nextInt();
			
		}
		int idx =0;
		for( int i=0; i<4; i++) {
			//opset[i]= sc.nextInt();
			int cnt = sc.nextInt();
			for( int j =0; j<cnt; j++) {
				opset[idx++]= i+1;
			}
		}
		
		dfs(0,1,num[0],0);
		System.out.println(max);
		System.out.println(min);
		
		
	}
	public static void dfs(int v, int next, int result , int len) {
		int answer =0;
		if(len==numset-1) {
			if( result > max) {
				max = result;
			}
			if(result < min) {
				min = result;
			}
		}else {
			
			for(int i=0; i<numset-1; i++) {
				if(!visit[i]) {
					switch(opset[i]) {
					case 1:
						answer = result + num[next];
						break;
					case 2:
						answer = result - num[next];
						break;
					case 3:
						answer = result*num[next];
						break;
					case 4:
						answer = result/num[next];
						break;
					}
					visit[i]= true;
					dfs(i, next+1, answer, len+1);
				}
				
			}
			
			
			
		}
		visit[v]= false;
		
		
		
		
	}
}
