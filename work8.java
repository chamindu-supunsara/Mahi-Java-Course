import java.util.*;
class work8{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		System.out.print("Number - ");
		int number = input.nextInt();
		String binary_number = "";
		
		while (number != 0){
			binary_number = (number%2) + binary_number;
			number /= 2;
		}
		System.out.println(binary_number);
	}
}
	
	



