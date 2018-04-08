package pro_3;

class TryHelloWorld
{	public int count(int a){
		int one = 0;//1개수 count
    	int zero = 0; //0개수 count

        if(a!=0 ){
        	int get = a;
        		  while(get!=1){
        			int b = get%2;
        			//System.out.println(b);
        		//	System.out.println(get);
		        	if(b==0){
		        		zero++;
		        		
		        	}else{
		        		one++;
		        	}
		        	get = get/2;
		        	
		        }
		        one++;
		    }

		return one;
	
	}
    public int nextBigNumber(int n)
    {
        int answer = 0;
        if(n!=0){
        	int first_count=0;
        	int second_count=0;
        	int first = n;
        	int second = n+1;
        	
        	while(true){
   
        		
        		 first_count = count(first);
        		 second_count = count(second);
        		 
        		if(first_count==second_count){
        			
        			return answer = second;
        		}else{
        			second++;
        		}
        	}
        }
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}
