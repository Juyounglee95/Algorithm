import java.util.*;
public class building {
	public int view(int[] input){
		int answer =0;
		int[] height = input;
		for(int i =2; i<height.length; i++) {
			int max =0;
			for(int k=1; k<height.length; k++) {
				int trial =0;
				if((height[i]-height[i-k])>0) {
					trial = height[i]-height[i-k];
					if(())
				}                          //¿ÞÂÊ Á¶¸Á °Ë»ç
			}
			
		}
		
		return answer;
		
	}
	public static void main(String[] abc) {
		Scanner scan = new Scanner(System.in);
		int testcase = 10;
		for(int i=0; i< testcase; i++) {
		int testnum = scan.nextInt();
		int[] input = new int [testnum];
		for(int k=0; k<testnum ; i++) {
			input[k] = scan.nextInt();
		}
		}
	}
}
