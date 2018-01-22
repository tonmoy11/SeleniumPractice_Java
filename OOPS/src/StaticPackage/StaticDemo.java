package StaticPackage;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		StaticExampleClass s1 =new StaticExampleClass("bmw");
		System.out.println("Make of car is " + s1.getMake());
		System.out.println("This is instance number: " + StaticExampleClass.getInstanceNum());
		
		
		StaticExampleClass s2 =new StaticExampleClass("mercedes");
		System.out.println("Make of car is " + s1.getMake());
		System.out.println("This is instance number: " + StaticExampleClass.getInstanceNum());

		StaticExampleClass s3 =new StaticExampleClass("mercedes");
		System.out.println("Make of car is " + s1.getMake());
		System.out.println("This is instance number: " + StaticExampleClass.getwheelsCount());
	}

}
