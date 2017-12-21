package day4;
public class StringDemo
{

 static void  p(String s) {
   System.out.println(s); 
 }

 public static void main(String[] args) {
    String  value = "Somasundaram";
    byte[] bt = {65, 66, 69, 90, 102};
    char[] ch1 = {'k', 'e', 's', 'a', 'v', 'a', 'r', 'a', 'm'};
    char[] ch2 = new char[15];

    String byteconv = new String(bt);
    String charconv = new String(ch1);
    p("result of constructors  byte : " + byteconv + 
                    " char: " + charconv);
  
   value.getChars(4,value.length(),ch2,0);
   p(new String(ch2));

   p("\n'base methods'");
   p("length is: " + value.length());
   p("char of " + value + " at index 3 is :" +
        value.charAt(3));

   double d = 88.89765;
   String dc = String.valueOf(d).concat("Rs");
   p("converted double in string is " + dc);

   String s1 = "I";
   String s2 = " like";
   String s3 = " java";
   p(s1 + s2 + s3);// concatenate using mixed concatenation
   p(s1.concat(s2.concat(s3)));

   String tr = "        sunder      ";
   p(tr + "das");
   tr = tr.trim();
   p(tr + "das");

   String rep  = "somaiah";
   p("\nbefore replace is: " + rep +
     " after replace is:" + rep.replace('a', '8'));
   p("uppercase of " + rep + " is: " + rep.toUpperCase());
   String upp = "SAMMAIAH";
   p("lowercase of "+ upp + "  is: " + upp.toLowerCase());

   p("\n'search methods'");
    
   String source  =  "Sathiveedu";
   String search  =  "veedu";
   System.out.println("contains is :" +
          source.contains(search));
 
   String demo = "\ncalculating calculator";
   p("string is: " + demo);
   p("index of  'c' is " + demo.indexOf('c'));
   p( "index of 'cul' is " + demo.indexOf("cul"));
   p("last index of 'c' is " + demo.lastIndexOf('c'));
   p("last index of 'cal' is " + demo.lastIndexOf("cal"));
   p("substring of demo starting with 3 is : " + 
                   demo.substring(3));
   p("substring of demo from 1 to 8 is : " +
                  demo.substring(1,8));
     
   p("\n'comparison methods'");
      
   String sc1 = "madivanan", sc2 = "madivanan", sc3 = "MADIVANAN";
   String str[] = {"ram", "kam", "nam", "sam", "jam",
                    "tom", "som", "zam", "dam", "GAM"};

   for(int i = 0;i<str.length;i++) {
    for(int j = i+1;j<str.length;j++) {
     if(str[j].compareTo(str[i])<0) {
      String temp  =  str[j];
      str[j]  =  str[i];
      str[i]  =  temp;
     }
    }
    System.out.print(" "+str[i]);       
   }       
   p("\nstmt that sc1,sc2 are same is : " + sc1.equals(sc2));
   p("stmt that sc1,sc3 are same despite case diff: " +    
             sc1.equalsIgnoreCase(sc3));
   p("stmt that s1 has start as 'tri' is : " +
          sc1.startsWith("madi"));
   p("stmt that s1 has end as 'ta' is : " +
                    sc1.endsWith("nan"));

   String[] strSplit = 
                  "java.oracle.vb.asp.jsp".split("[.]");
   p(java.util.Arrays.toString(strSplit));  

   p("Be aware of String references");
   String str1 = "String references";
   p(str1);
   str1.concat(" Exercise caution");
   p(str1);
   str1 = str1.concat(" Exercise caution");
   p(str1); 
  }

} 
     


   