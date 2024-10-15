package StringBufferExamples;

public class DeleteStringBufferMethod {

	public static void main(String[] args) {
	StringBuffer s = new StringBuffer("Welcome");
	s.delete(0, 5);
	System.out.println(s);

	}

}
