package pro_6;

import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){ //n => 배열크기 s=> sum
        int[] answer = null;
        if(n>s){
        	answer[0] = -1;
        }else{
        	answer = new int[n];
        	for(int i=0; i<answer.length; i++){
        		int value = s/n;
        		answer[i] = value;
        		s = s-value;
        		n--;
        	}
        }
        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(4,10)));
    }

}
