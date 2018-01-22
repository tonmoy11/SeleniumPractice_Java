
public class ClassDemo {

	static String str2 ="yo";
	static int bubam =12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str = "hello java";
			
			System.out.println(str);
			System.out.println(str2);
		
			System.out.println("************************************");
			CarClass c1 = new CarClass();
			CarClass c2 = new CarClass();
			
			/*c1.model =20;
			c2.year="hooas";
			*/
			
			System.out.println(c1.model);
			System.out.println(c1.getYear());

	}

}
class CarClass{
	
	int year = 2000;
	String model;
	
	public int getYear(){
		return this.year;
	}
}

