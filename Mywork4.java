import java.util.*;
class Mywork4{
	public static void main(String args[]){
		int x = 10; //Gobal variable
		int y = 20;	//Gobal variable
		{
			int z = 30;	//Local variable
			System.out.println(x);
			System.out.println(y);	//Gobal variable can use any scope
			System.out.println(z);
		}
		System.out.println(x);	//Gobal variable can use any scope
		System.out.println(y);	
		//System.out.println(z); /Local variable cant use this scope
	}
}
	
	
	



