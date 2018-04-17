package pro_8;

class Hopscotch {
	int compare(int[][] comBoard,int length, int origin, int comp){
		int index=0;
		if(comBoard[length][origin]<=comBoard[length][comp]){
			index = comp;
		}else{
			index = origin;
		}
		
		return index;
	}
	int checkmax(int [][]board, int length){
		int max=board[length][0];
		int index =0;
		
		for(int i=0; i<4; i++){
			if(max<=board[length][i]){
				max = board[length][i];
				index = i;
			}
		}
		return index;
	}
    int hopscotch(int[][] board, int size) {
        int result = 0;
        // 함수를 완성하세요.
        int max=board[0][0];
        int nextmax = board[1][0];
        int compindex=0;
        int check =0;
        for(int i=0; i<board.length; i++){
        	max = board[i][0];
        	
        	for(int j =0; j<4; j++){
        		
        		if(max<=board[i][j]){
        			if(max==board[i][j]){
        				if(i+1<board.length){
        					compindex =compare(board,i+1,check,j); //check보다 j가 더크면 j인 값 0
        					board[i][compindex]=0;
        				}
        				check = checkmax(board,i);
        				
        			}
        			
        			max = board[i][j];
        			check =j; //maximum 수가 있는 열 저장
        			
        			
        		
        		}
        		
        	}
        	
//        	if((i+1)<board.length){
//				board[i+1][check]=0;
//				
//				
//        	}
        	result +=board[i][check];
        	System.out.println("$$"+i+"value"+board[i][check]+"***"+check);
        	
        }
       
        return result;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = {{7, 4, 1, 7}, {4, 5, 10, 10}, {8, 1, 9, 2}, {3, 10, 10, 7}, {2, 1, 5, 6}, {3, 1, 4, 8}, {10, 8, 4, 5}, {3, 4, 2, 1}, {1, 7, 10, 10}, {5, 7, 10, 6}};
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 3));
    }

}