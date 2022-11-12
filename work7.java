import java.util.*;
class work7{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("First Number - ");
		int start =  input.nextInt();
		System.out.println("Second Number - ");
		int end =  input.nextInt();

		while (start <= end){
			if (start % 2 == 1){
				System.out.println(start);
			}
			start ++;
		}
	}
}
	
	



