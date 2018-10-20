import java.util.*;
public class gear {
//	static int firgear[]= new int[8];
//
//	static int secgear[]= new int[8];
//
//	static int thrgear[]= new int[8];
//
//	static int fourgear[]= new int[8];
	static int gear[][] = new int[4][8];
	static boolean rot[] = new boolean[4];
	public static void main(String []a) {
		
		Scanner sc = new Scanner(System.in);
		for( int i=0; i<4; i++) {
			String s = sc.next();
			for(int j=0; j<8; j++) {
				gear[i][j]= s.charAt(j)-'0';
			}
		}
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<8; j++) {
//				System.out.print(gear[i][j]);
//			}
//			System.out.println(" ");
//		}
		
		int rot = sc.nextInt();
		
		for(int i=0; i<rot; i++) {
			int gearnum = sc.nextInt();
			int dir = sc.nextInt();
			left(gearnum-1, -dir);
			right(gearnum-1, -dir);
			
			rotate(gearnum-1, dir);
//			for(int k=0; k<4; k++) {
//			for(int j=0; j<8; j++) {
//				System.out.print(gear[k][j]);
//			}
//			System.out.println(" ");
//		}
		
		}
		System.out.println(sum(gear));
		
	}
	public static int sum(int[][]gear) {
		int result =0;
		for(int i=0; i<4; i++) {
			//System.out.println("^^"+result);
			result +=gear[i][0]*Math.pow(2, i);
		//	System.out.println("^^"+result);
		}
		return result;
	}
	public static void rotate(int k, int dir) {
		//System.out.println("&&&"+k);
		if(dir ==1) {
			clock(gear,k);
		}else {
			counterclock(gear, k);
		}
	}
	public static void clock(int[][]gear, int k) {
		int temp=gear[k][7];
		for(int i=7; i>=1;i-- ) {
			gear[k][i]= gear[k][i-1];
		}
		gear[k][0]= temp;
		
	}
	public static void counterclock(int[][]gear, int k) {
		int temp = gear[k][0];
		for(int i=0; i<7; i++) {
			gear[k][i]= gear[k][i+1];
			
		}
		gear[k][7]= temp;
	}
	public static boolean checkrot(int a, int b) {
	//	System.out.println("&&&"+a+","+b);
		if(a<b) {	
			if(gear[a][2]== gear[b][6]) {
				return false;
			}else {
				return true;
			}
			
		}
		else {
			if(gear[a][6]== gear[b][2]) {
				return false;
				
			}else {
				return true;
			}
		}
	}
	public static void left(int a, int dir) {
		if(a==0) {
			return;
		}
		else {
			if(checkrot(a, a-1)) {
				left(a-1, -dir);
				rotate(a-1, dir);
				
			}else {
				return;
			}
		}
		
	}
	public static void right (int a, int dir) {
		if(a==3) {
			return;
		}
		else {
			if(checkrot(a, a+1)) {
				right(a+1, -dir);
				rotate(a+1, dir);
			
			}else {
				return;
			}
		}
	}
}
