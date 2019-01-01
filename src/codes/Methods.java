package codes;

public class Methods {
	
	public static int add(int number1, int number2)
	{
		System.out.println("Method 1");
		int total = number1 + number2;
		return total;
	}
	
	
	public static double add(int number1, double number2)
	{
		System.out.println("Method 2");
		double total = number1 + number2;
		return total;
		
	}
	
	public static void sayHello()
	{
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		int value = add(5,6);
		System.out.println("The value is: " + value);
	}

}
