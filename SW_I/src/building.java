import java.util.*;
public class building {
	public static int leftview(int[] input, int k){
		int answer =0;
		int[] building = input;
		int dis_1=0;
		int dis_2=0;
		
		if((building[k]-building[k-1])>0) { //바로 왼쪽 건물하고 높이 비교
			dis_1 = (building[k]-building[k-1]);
			if((building[k]-building[k-2])>0) { //거리 2 인 왼쪽건물하고 높이 비교
				dis_2 = (building[k]-building[k-2]);
				answer = Math.min(dis_1, dis_2);
			}else {
				answer = 0;
			}
		}else {
			answer =0;
		}
		
		
		return answer;
		
	}
	public static int rightview(int[] input, int k){
		int answer =0;
		int[] building = input;
		int dis_1=0;
		int dis_2=0;
		
		if((building[k]-building[k+1])>0) { //바로 오른쪽 건물하고 높이 비교
			dis_1 = (building[k]-building[k+1]);
			if((building[k]-building[k+2])>0) { //거리 2 인 오른쪽 건물하고 높이 비교
				dis_2 = (building[k]-building[k+2]);
				answer = Math.min(dis_1, dis_2);

			}else {
				answer = 0;
			}
		}else {
			answer =0;
		}
		
		
		return answer;
		
	}

	public static void main(String[] abc) {
		Scanner scan = new Scanner(System.in);
		int testcase = 10;
	for(int i=0; i< testcase; i++) {
	int testnum = scan.nextInt();
		//int testnum= ;
		int[] input = new int [testnum];
		for(int k=0; k<testnum ; k++) {
			input[k] = scan.nextInt();
		}
		int leftdis =0; 
		int rightdis=0;
		int sum=0;
		for(int j=2;j<testnum-2; j++) {
			int min=0;
			 leftdis = leftview(input, j);
			if(leftdis>0) {
			 rightdis = rightview(input, j);

			 min = Math.min(leftdis, rightdis);
			 
			}
			sum+=min;
			
			
		}
		System.out.println("#"+(i+1)+" "+sum);
		
		
	}
	}
}
