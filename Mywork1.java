import java.util.*;
class Mywork1{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Marks - ");
		int mark =  input.nextInt();
		String result;
		result = (mark > 50) ? "Pass" : "Fail";
		System.out.println("Result - " + result);
		
	}
}
	
	
	



