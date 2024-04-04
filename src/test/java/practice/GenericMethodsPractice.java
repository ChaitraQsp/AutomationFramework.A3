package practice;

public class GenericMethodsPractice {
	
	public static void main(String[] args) { //Caller function - User
		
//		int a = 20;
//		int b = 30;
//		int c = a+b;
//		System.out.println(c);
		
		int sum = add(20,49);
		int value = sum + 20;
		System.out.println(value);
		
		add(78,54);
		add(57,70);
		
	}
	          //parameterise - inputs from caller - 1
	public static int add(int a, int b) //Called Function - generic method
	{
		int c = a+b;
		return c;
		//return the output to the caller - 2
	}

}
