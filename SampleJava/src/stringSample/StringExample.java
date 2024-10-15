package stringSample;

public class StringExample
{

	public static void main(String[] args) 
	{
		String s = "Hello"; // string creation with string literal
		char[] c = {'s','t','r','i','n','g'}; 		
		String ss = new String(c); //converting to char to string
		String st = new String("World"); // String creation using new keyword
		System.out.println(s);
		System.out.println(ss);
		System.out.println(st);
		
	}

}
