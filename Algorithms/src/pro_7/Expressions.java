package pro_7;

public class Expressions {
	int even(int num){
		int answer = 1;
		int limit = num/2;
		int check =0;
		int def =1; //default값 =1
		
		for(int i=1; def<limit; i++){ //def와 limit이 같은 경우 무한 반복
			
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
		int def =1; //default값 =1
		
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
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(10));
	}
}