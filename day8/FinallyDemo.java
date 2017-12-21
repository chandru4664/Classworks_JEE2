package day10;
public class FinallyDemo {

 public static void main(String[] args){
  try {
    int i = Integer.parseInt(args[0]);
    System.out.println("i's value is:" + i);
  }catch(NumberFormatException ne) {
    System.out.println("conversion error");
  }
  finally {
    System.out.println("This is the from finally block");
  }
 }
  
}        