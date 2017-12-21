package day4;

public class StringImmut {

 public static void change(String str)    {
   str += " blah blah";
   System.out.println(str);
 }
    
    
 public static void change(StringBuffer str)  {
     str.append(" blah blah");        
 }
    
 public static void main(String[] args) {
  String src = "Hi! ";
  change(src);
  System.out.println(src);
  StringBuffer sb = new StringBuffer(src);
  change(sb);
  System.out.println(sb.toString());     
 }

}
