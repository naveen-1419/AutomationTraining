package String;

public class Palindrome {
	
	  void onePalindrome() {

	        String string = "133223";
	        StringBuilder stringBuilder = new StringBuilder(string);
	        stringBuilder.reverse();
	        String reverse = stringBuilder.toString();

	        if(string.equals(reverse)){
	            System.out.println("The given string is palindrome");
	        }
	else{
	            System.out.println("The given string is not a palindrome");
	        }
	    }
	
}
