package day4;

public class StringStringBuffDiff {

  public static String addStrings(String src, String[] toBeAdded) {
   for(String s:toBeAdded)  {
     src += " "+s;
   }
    return src;
  }

  public static String appendStrings(String src,String[] toBeAdded) {
   StringBuffer sb = new StringBuffer(src);
   for(String s:toBeAdded) {
     sb.append(" "+s);
   }
    return sb.toString();
  }
    
  public static String[] getTokens()  {
   String[] arr = new String[500];
   for(int i=0;i<arr.length;i++) {
            arr[i] = "htc-"+i;
   }
     return arr;
  }

  public static void main(String[] args) {
   String[] tokens = getTokens();
   String src = "aaa";  
   long st = System.currentTimeMillis();
   addStrings(src,tokens);
   long ed = System.currentTimeMillis();
   System.out.println("for String:"+(ed-st));
        
   st = System.currentTimeMillis();
   appendStrings(src,tokens);
   ed = System.currentTimeMillis();
   System.out.println("for StringBuffer:"+(ed-st));
  }

}