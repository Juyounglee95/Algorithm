package pro_4;

class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		// 야근 지수를 최소화 하였을 때의 야근 지수는 몇일까요? //남은 일의 양들의 차이가 최대한 적게 
		if(no!=0&&works!=null){
			
			int [] copyWork = new int[works.length];
			int workingTime = 0;
			int min = works[0];
			int minNum = 0;
			for(int i =0 ; i<works.length; i++){
				copyWork[i]=works[i];
			}
			
			for(int i=0; i<works.length; i++){
				if(min>=works[i]){
					min = works[i];
					minNum = i;
				}
			}
			System.out.println("min: "+ min);
			
			
			for(int i =0; i<works.length; i++){
				if(works[i]>=min){
					
					workingTime+=(works[i]-min);
					works[i]=min;
				}
				System.out.println("$$$$$$$works"+works[i]);
				
			}
			int last = workingTime - no;

			System.out.println(last);
				
			for(int i =0;last<0; i++ ){
		
				if(copyWork[i]!=min){
					    	
				    
					works[i]--;
					last++;
				    }
					System.out.println(i);
					if(i== works.length-1){
						i=-1;
					}
				}
				
			for(int i =0;last>0; i++ ){
				if(copyWork[i]!=works[i]){
					works[i]++;
					last--;
				}
				if(i== works.length-1){
					i=-1;
				}
			}
		
			
			for(int i=0  ; i<works.length; i++){
				System.out.println("works"+works[i]);
				result  += works[i]*works[i];
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int []test = {3,3,4,6,3,3,1};
		System.out.println(c.noOvertime(1,test));
	}
}
