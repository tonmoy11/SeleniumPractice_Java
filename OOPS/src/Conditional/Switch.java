package Conditional;

public class Switch {

	public static void main(String[] args) {
	int numDays = numOfDays(2016,2);
	System.out.println("Number of days in agiven year adn month are : " + numDays);
	}
	
	static int numOfDays(int year, int month){
		int numDays = 0;
		switch (month) {
		case 1 : 
				numDays =31;
				break;
		
		case 2:
		//updating the condition to match the correct calculation for the leap years
			if ((year %400 ==0) || (year % 4 == 0) && (year % 100 != 0)){
				numDays =29;
			}
			else {
				numDays =28;
			}
			break;
		
		case 3:
			numDays =31;
			break;
			
		case 4:
			numDays =30;
			break;
		case 5:
			numDays = 31;
			break;
		
		
		}
		return numDays;
		
		
	}

		
		
}
