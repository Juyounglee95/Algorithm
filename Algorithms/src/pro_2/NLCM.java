package pro_2;
import java.util.*;
class NLCM {
	public long get_gcd(long a, long b){
		long gcd =0;
		long max = Math.max(a,b);
		long min = Math.min(a,b);
		//gcd = min;
	    while((max%min)>0){
	    	gcd =max%min;
	    	max = min;
	    	min = gcd;
	    }
		gcd = min;
		return gcd;
	}
	public long nlcm(int[] num) {
		long answer = 0;
		long gcd=0;
		long lcm=0;
		if(num!= null){
			int []getArr = num;
			long max=getArr[0];
			//max ���ϱ�
			
			for(int i =0; i<getArr.length; i++){
				if(max< getArr[i]){
					max = getArr[i];
				}
			}
			for(int i=0; i<getArr.length; i++){
				gcd=get_gcd(max, getArr[i]); //���μ��� ���� gcd = 1 
				lcm = (max*getArr[i])/gcd;
				max = lcm;
			}
			answer = max;
			
		}
		return answer;
	}
	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6,8,14};
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.nlcm(ex));
	}
}


