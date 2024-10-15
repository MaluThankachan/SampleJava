package debugging1;

public class Class1 {
	
	public static int divide(int a, int b)
	{
		int res = a/b;
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println(Class1.divide(5, 0));
	}
	//another way of static creation

	 /*public static void main(String[] args) {
	        int x = 5;
	        int y = 0;
	        int result = divide(x, y);
	        System.out.println("Result: " + result);
	    }

	    public static int divide(int a, int b) {
	        return a / b;
	    }*/
}
