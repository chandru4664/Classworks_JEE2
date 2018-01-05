
public class VariableLengthDemo {
	public static void main(String[] args) {
		print("kiran","raj","ram");
		print("kiran","ram");
		print();
		
	}
	
	public static void print(String...names){
		System.out.println("print parameter");
		for(String name:names){
			System.out.println(name+" ");
		}
		System.out.println();
	}

}
