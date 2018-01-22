package StaticPackage;

public class StaticExampleClass {
	private static int wheelsCount = 4;
	private String make;
	private static int instanceNum = 0;
	
	public StaticExampleClass(String make){
		this.make =make;
		instanceNum++;
		}

	public String getMake(){
	 return make;
	}
	
	public static int getInstanceNum(){
		return instanceNum;
	}

	public static String getwheelsCount() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
