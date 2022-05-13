package String;

public class ReverseString {
	
	
	
	public void stringReverse() {
//      Scanner scanner=new Scanner(System.in);
//      String string = scanner.nextLine();
//      String string = "abcd";
//      StringBuilder builder = new StringBuilder(string);
//      System.out.println(builder.reverse());

      String string = "abcd";
      String reverse = "";
      for(int value = string.length()-1;value>=0;value--){

          reverse = reverse+string.charAt(value);
      }
      System.out.println("Reverse String :"+reverse);

  }
  
  }

