import java.lang.reflect.Array;
import java.util.Scanner;
public class snail {
	
	public static int[][] snail(int input) {
		int [][] answer = new int [input][input];
		
		int x =0;
		int y=-1;
		int num =1;
		int index =1;
		int loof = input;
		while(loof>=0) {
		
			for(int i=0; i< loof; i++) {
			y = y+index;
			answer[x][y]= num;
			num++;
			
			}
			loof--;
			for(int i=0; i<loof; i++) {
				x= x+index;
				answer[x][y]= num;
				num++;
			}
			
			index = index*(-1);
		}
		
		return answer;
	}
	
	public static void main(String []a) {
		Scanner scan = new Scanner(System.in);
		
		int testcase = scan.nextInt();
		
		for(int i=0; i< testcase ; i++) {
			int testnum = scan.nextInt();
			int [][]answer = snail(testnum); 
			System.out.println("#"+testnum);
			for(int j=0; j<testnum; j++) {
				for( int k=0; k<testnum ; k++) {
					System.out.print(answer[j][k]+" ");
				}
				System.out.println(" ");
			}
		}
	}
}
