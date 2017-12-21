package day10;
public class NestTry {

 public static void main(String[] args) {
  int    a = args.length;
  int[]  c = {1};
  
  try {     
  
    System.out.println("a "+a);
    int b = 42/a;    
   
   try {
       /* if one command line args is used
         then a divide by zero exception is raised */
    if (a == 1){   
     a = a/(a-a);
    }    
    else if (a >= 2) {
     c[4] = 43;
    }
   }catch(ArrayIndexOutOfBoundsException  e) {
     c[0] = 43;
     System.out.println(e);
   } 
   System.out.println("between tries");
  }catch(ArithmeticException  e) {
    System.out.println(e);
  }
  System.out.println(java.util.Arrays.toString(c)); 
  System.out.println("Normal Code Line");
 }

}