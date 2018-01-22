
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	for (intialization; boolean_expression; update)
		
		
	for(int i=0; i<10; i++)	{
		System.out.println("THE VALUE OS I IS :" + i);
	}
		int [] numbers = {10,20,30};
		for (int i= 0; i<numbers.length; i++){
			System.out.println("the value of index"+ i+" is:" + numbers[i]);
		}
		
		for(int number: numbers){
			System.out.println("The value is:" + number);
		}
		
		String[] cars= {"bmw", "audi", "toyota"};
		for( String cars1: cars){
			System.out.println("the car is "+ cars1);
		}
	}

}
