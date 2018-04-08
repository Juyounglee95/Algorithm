package pro_1;
class Jump_practice {

    public int jump_practice(int num) {
        int answer = 0;
      	if(num>0){
       	int[] aa = new int [num];
          aa[0]=1;
        
      		aa[1]=aa[0]+1;
        
        for(int i =2; i<num; i++){
        	aa[i]= aa[i-1]+aa[i-2];
            	answer = aa[i];
       		 }
      
        }
      	
       return answer; 
    }

    public static void main(String[] args) {
      Jump_practice c = new Jump_practice();
        int testCase = 10;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
      	
        System.out.println(c.jump_practice(testCase));
    }
}