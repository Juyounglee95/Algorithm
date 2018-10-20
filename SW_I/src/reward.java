import java.util.*;
public class reward {
	public static char[] find (char[] set, int num) {
		char[]answer = set;
		char max = answer[0];
		
		int index =0;
		for(int i=0; i<answer.length-1; i++) {
			index =i;
			for(int j=1; j<answer.length; j++) {
			if(answer[i]<answer[j]) {
				max = answer[j];
				
			}
			}
		}
		
		return answer;
	}
	public static void main(String []a) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		
		for(int i=0; i<testcase; i++) {
			String card = scan.next();
			char[] cardset = card.toCharArray();
			
			int num = scan.nextInt();
			
			char [] answer  = find(cardset, num);
			for(int k=0; k<answer.length; k++) {
				System.out.print("#"+(i+1)+answer[i]);
			}
			System.out.println(" ");
		}
	}
}
