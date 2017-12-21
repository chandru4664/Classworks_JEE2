package day4;
public class StringBuffDemo {  
  static void  p(String s) {
     System.out.println(s); 
  }

  public static void main(String[] args) {
    StringBuffer  sb1 = new StringBuffer();
    StringBuffer  sb2 = new StringBuffer(11);
    StringBuffer  sb3 = new StringBuffer("Hello Brother");
    StringBuffer  sb4 = new StringBuffer("I  ");
    StringBuffer  sb5 = new StringBuffer("JAVA");
    StringBuffer  sb6 = new StringBuffer("John Miller");
    p("\ncapacities of sb1,sb2,sb3: " +
              sb1.capacity()+ "," +
              sb2.capacity()+ "," +
              sb3.capacity());
    p("length of sb2,sb3: "+ sb2.length() +
      "," + sb3.length());
    sb3.setLength(20);
    p("after length incr sb3 is: " + sb3+"***");

    sb3.setLength(10);
    p("\nafter length decr sb3 is: " + sb3);

    sb3.ensureCapacity(45);
    p("capacities of sb3: "+sb3.capacity());
    sb3.ensureCapacity(140);
    p("capacities of sb3: "+sb3.capacity());

    sb3.setCharAt(2,'#');
    p("\nafter set char sb3 is "+sb3); 

    p(sb4+" after append sb4 is: "+sb4.append(sb5));
    sb4 = sb4.insert(2,"will learn ");
    p("\nafter insert sb4 is "+sb4);
    
    p("\nafter reverse sb4 is: "+sb4.reverse());

    p(sb3+" after deletion from 2 to 5 sb4 is: " 
      + sb3.delete(2,5));    
    p(sb5+"  after deletion char at 2: " 
      + sb5.deleteCharAt(2)); 
   
    p("\n"+sb6+" after replacing string  is " 
      + sb6.replace(2,7,"999Ki"));
    
    p("Care about equals method as it is not Overridden by StringBuffer");
    sb1 = new StringBuffer("Hello");
    sb2 = new StringBuffer("Hello");
    System.out.println("Gives False->" + sb1.equals(sb2));
  }

}