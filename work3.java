import java.util.*;
class work3{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("First Number - ");
		int start =  input.nextInt();
		System.out.println("Second Number - ");
		int end =  input.nextInt();

		for (int i = start;(i <= end); i ++){
			if (i%2 == 1){
			System.out.println(i);
			}
		}
	}
}
	
	
	



