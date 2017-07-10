package LEC1210;

public class Lec1210 {

	public static void main(String[] args) {

		//Quiz 
		// 3 questions
		// Binary => decimal code(recur)
		
		//1. Hexa. ,Octal, Binary, 
		
		
		//2. MVC pattern
		//- updater(puzzle game ex)
		
		//3. key pressed handler
		
		//keyPressedHandler
		
	}
	
	public static int binaryToDecimal(String binInput){  
	    int len = binInput.length();
	    if (len == 0) return 0;
	    String now = binInput.substring(0,1);
	    String later = binInput.substring(1);
	    return Integer.parseInt(now) * (int)Math.pow(2, len-1) + binaryToDecimal(later);     
	}
}
