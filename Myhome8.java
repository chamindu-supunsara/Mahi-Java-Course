import java.util.*;
class Myhome8{
	public static void main(String args[]){
		Scanner input2 = new Scanner(System.in);
		Random input = new Random();
		
		
		int number1 =  input.nextInt(20);
		System.out.println("Random Number - "+ number1);
		System.out.println("Enter Number One - ");
		int number2 =  input2.nextInt();
		System.out.println("Enter Number Two - ");
		int number3 =  input2.nextInt();
		
		int max_num = number1;
		if (max_num < number2){
			max_num = number2;
			if (max_num < number3){
				max_num = number3;
			}
		}
		else{
			if (max_num < number3){
				max_num = number3;
			}
		}
		System.out.println("Maximum Number - " + max_num);
	}
}
	
	
	



