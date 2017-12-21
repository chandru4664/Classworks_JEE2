package day10;
class CheckEx extends Exception {

 String cause;
 public CheckEx(String cause){
  this.cause = cause;
 }
 public String getMessage() {
  return cause;
 }
}

class CheckExUse {
 
 public String dispPower5(int input) throws CheckEx {
  String ret = "";
  if(input>0) {
   ret = ""+Math.pow(input,5);
  }
  else {
   throw new CheckEx("input <= 0");
  }
  return ret;
 }
 
}

public class UncheckDemo {
 
 public static void main(String[] args){
  if(args.length<1){
   System.out.println("should be with a number arg");
   System.exit(1);
  }
  try {
    int val = Integer.parseInt(args[0]);
    CheckExUse checkExUse = new CheckExUse();
    System.out.println(checkExUse.dispPower5(val));
  }catch(CheckEx ex) {
     throw new RuntimeException(ex.getMessage());
  }
 }
}
