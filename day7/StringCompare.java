package day4;
/* this will give difference of ascii values of d &b whic happens the first character that differs and ignore the latter chars */
public class StringCompare
 {
  public static void main(String args[])
   {
    String xx = "aads";
    String yy = "aabuj";
    System.out.println("diff in ascii:"+
             xx.compareTo(yy));
    }
}