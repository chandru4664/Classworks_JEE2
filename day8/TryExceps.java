package day9;
public class TryExceps {

 public static void main(String[] args) {
  System.out.println("Entered Main");
            
  int i = 0;
  try {      
   i = Integer.parseInt(args[0]);   
   System.out.println("blah blah");   
  }catch(NumberFormatException ne) {
      ne.printStackTrace();
	  System.out.println("Given String is Wrong type");
     i = 10;
  }
  System.out.println("converted value is : "+i);
  System.out.println("Exited Main normally");
 }

}