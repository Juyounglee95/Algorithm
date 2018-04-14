package pro_6;

import java.util.Arrays; //�׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.

public class BestSet {

    public int[] bestSet(int n, int s){ //n => �迭ũ�� s=> sum
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
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(4,10)));
    }

}
