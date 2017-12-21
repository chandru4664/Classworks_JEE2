package day4;
class Abc{}

 class Def {
     int id;
  public Def(int d) {
   id = d;
  }
  
  public String toString() {
     return "We are learning java";
  }

  public int hashCode() {
   return id*1000;
  }
 
 }  

 public class ToStringDemo {

  public static void main(String[] args) {
    Abc a1 = new Abc();
    Def d1 = new Def(60);
    System.out.println(a1);
    System.out.println(a1.hashCode());
    System.out.println(d1);
    System.out.println(d1.hashCode());
  }

}