import java.util.*;
class Myhome5{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks - ");
		int mark =  input.nextInt();
		if (mark >= 75){
			System.out.println("Best");
		}
		else{
			if (mark >= 65){
				System.out.println("Better");
			}
			else{
				if (mark >= 50){
					System.out.println("Good");
				}
				else{
					System.out.println("Nort Good");
					}
				}
			}
		}
	}
	
	
	



