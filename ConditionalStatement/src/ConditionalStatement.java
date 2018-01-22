
public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condition =10 == 10;
		System.out.println(condition);
		
		int val1 =1;
		int val2 =2;
		
		boolean cond = val1==val2;
		System.out.println(cond);
		
		if(val1 == val2){
			System.out.println("yes, it is true");
		}else{
			System.out.println("false");
		}
	
		
		System.out.println("**********************");
		
		int score =91; 
		String grade;
		
		if(score > 90){
			grade = "A";
		}else if (score > 80){
			grade = "B";
		}else{
			grade="C";
		}
		System.out.println("score is :"+ score);
		System.out.println("grade is :"+ grade);
	
	}

}
