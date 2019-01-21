import java.util.Scanner;
public class max_reward {
	static int casenum;
	static int result, max;
	static boolean check[][];
	public static void main(String iamground[]) {
		Scanner scan = new Scanner(System.in);
		casenum = scan.nextInt();
		
		for(int i=1; i<=casenum; i++) {
			String num = scan.next();
			max = scan.nextInt();
			//System.out.println("^^"+max);
			check = new boolean[max+1][1000000];
			result =0;
			dfs(num.toCharArray(), 0);
			
			System.out.println("#"+i+" "+result);
		}
		
	}
	static int changetoNum(char[] number) {
		
		return Integer.parseInt(String.valueOf(number));
	}
	static void dfs(char[] numset, int now) {
		if(max ==now) {
			int getnum= changetoNum(numset);
			if(result<getnum) {
				result = getnum;
				
			}
			return;
		}
		
		int M = numset.length;
		
		for(int i=0; i<M-1; i++) {
			for(int j = i+1; j<M; j++) {
				char[] testnum = swap(numset, i,j);
				//System.out.println("&&&&"+i+"&&&"+j+"&&&"+changetoNum(testnum));
				if(!check[now+1][changetoNum(testnum)]) {
					check[now+1][changetoNum(testnum)]= true;
					dfs(testnum, now+1);
				}
			}
		}
	}
	
	static char[] swap(char[]numset, int i, int j) {
		char[] temp = numset.clone();
		char first = temp[i];
		temp[i]= temp[j];
		temp[j]= first;
		
		return temp;
		
	}
}
