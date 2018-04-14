package pro_5;

import java.util.*;
class Caesar {
	char change(char c, int n){
		char result =' ';
		
		char []ch = {c};
		//System.out.println(c);
		String stArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int location = stArray.indexOf(c);
		int newlocation = location+n;
		//System.out.println(newlocation);
 		if(newlocation>25){
 			while(newlocation>25){
 				newlocation -=26; 
				
}
 		}
    
		result = stArray.charAt(newlocation);
		
		return result;
	}
	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
		String newString = s;
		
		for(int i=0; i<newString.length(); i++){
			char ch = newString.charAt(i);
			char getchar =' ';
			boolean upCase = true;
			if(ch >=65&&ch<=90){ //uppercase
				upCase = true;
				getchar = change(ch,n);
				
				
			}else if(ch>=97&&ch<=122){ //lowercase
				upCase = false;
				char upchar = (char)(ch-32); //대문자로 변경
				
				getchar = change(upchar,n);
				getchar = (char)(getchar+32);
			}
			
			result +=getchar;
		}
		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'nrvc', n은 36인 경우: " + c.caesar("nrvc ",36));
	}
}
