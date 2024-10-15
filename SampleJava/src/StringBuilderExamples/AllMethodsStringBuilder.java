package StringBuilderExamples;

public class AllMethodsStringBuilder {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Welcome to India");
		System.out.println("The original string is "+ s);
		//append string
		System.out.println("1.The append method is "+s.append("!!!!!"));
		//insert string
		System.out.println("2. The insert method is "+s.insert(16," Hurray"));
		//replace string
		System.out.println("3.The replace method is "+s.replace(17, 23," Waaw"));
		//delete string
		System.out.println("4.The delete method is "+s.delete(17, 21));
		//reverse string
		System.out.println("5.The reverse method is "+s.reverse());
		
	}

}
