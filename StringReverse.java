package String;

public class StringReverse {
	
		  public void reverseString() {
		    String string = "abcd";
		    String reversed = reverse(string);
		    System.out.println("The reversed string is: " + reversed);
		  }

		  public static String reverse(String string) {
		    if (string.isEmpty())
		      return string;

		    return reverse(string.substring(1)) + string.charAt(0);
		  }
		
		  }

