package pro_7;

public class Expressions {
	int even(int num){
		int answer = 1;
		int limit = num/2;
		int check =0;
		int def =1; //default�� =1
		
		for(int i=1; def<limit; i++){ //def�� limit�� ���� ��� ���� �ݺ�
			
			check +=i;
			
			if(check==num){
				
				answer++;
				def++;
				check = def;
				i=def;
			
				
			}else if(i==limit){
				
				
				def++;
				check = def;
				i=def;
			}
		
		}
		return answer;
	}
	int odd(int num){
		int answer = 1;
		int limit = num/2;
		int check =0;
		int def =1; //default�� =1
		
		for(int i=1; def<=limit; i++){
			
			check +=i;
		
			if(check==num){
				
				answer++;
				def++;
				check = def;
				i=def;
			
				
			}else if(i==limit){
				def++;
				check = def;
				i=def;
			}
		}
		return answer;
	}
	public int expressions(int num) {
		int answer = 1;
		int checkNum = num%2;
		if(checkNum==0){
			answer = even(num);
		}else{
			answer = odd(num);
		}
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(10));
	}
}