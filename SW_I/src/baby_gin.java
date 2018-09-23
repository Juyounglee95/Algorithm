import java.util.*;

public class baby_gin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		int[]count = new int[10];
		//int[]input = new int[6];
		for(int i=0; i<6; i++) {
			int input= scan.nextInt();
			count[(input%10)]++;
			
		}
//		for(int i=0; i<10; i++) {
//			System.out.println(count[i]);
//		}
		int triplete=0;
		int run =0;
		for(int i=0; i<10; i++) {
			//System.out.println(i);
			if(count[i]>=3) {
				triplete++;
				count[i]-=3;
				if(i!=0) {
				i--;
				}
		//		System.out.println("**"+i);
			}
			if(i<7) {
				if((count[i]>=1)&&(count[i+1]>=1)&&(count[i+2]>=1)) {
					count[i]-=1;
					count[i+1]-=1;
					count[i+2]-=1;
					run++;
					i--;
			//		System.out.println("&&"+i);
				}
				
			}
		}
		
		if(run+triplete ==2) {
		System.out.println("baby gin");
		}else {
			System.out.println("lose");
		}
	}

}
