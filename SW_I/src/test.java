import java.util.Scanner;
public class test {
	public static int count(int[]input, int k) {
		int answer =0;
		int[] score = input;
		for(int i=0; i<1000; i++) {
			if(k==score[i]) {
				answer++;
			}
			
		}
		return answer;
	}
	
	
	public static void main (String[]abc) {
		Scanner scan = new Scanner(System.in);
		int testcasenum = scan.nextInt();
		int []score = new int[1000];
		for(int i=0; i< testcasenum; i++) {
			int testcase = scan.nextInt();
			
			for(int k=0; k<1000; k++) {
				score[k]= scan.nextInt();
				
			}
			int max =0;
			int max_num=0;
			for(int j=0; j<1000; j++) {
				int test=count(score, score[j]);
				
				if(max<=test) {
					
					if(max==test) {
					if(max_num<score[j]) {
						//System.out.println("&&"+j+"  "+test+"**"+max_num+"^^^"+score[j]);
						max_num = score[j];
					}
					}else {
						max= test;
						max_num= score[j];
					}
				}
				//System.out.println("max"+max+"score"+max_num);
			}
			System.out.println("#"+testcase+" "+max_num+" "+max);
		}
		
		
	}
	
	
}
