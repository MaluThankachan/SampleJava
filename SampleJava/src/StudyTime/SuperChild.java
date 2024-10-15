package StudyTime;

public class SuperChild extends SuperParent
 {
	int f=50;
	int g;
	public SuperChild()
	{
		super();
	}
	public void print()
	{
		System.out.println("Using super " +super.d);
		super.display();
	}
	public static void main(String[] args) 
	{
		
		
		SuperChild s = new SuperChild();
		System.out.println("Using child object " +s.d);
		s.display();
		System.out.println(s.area(20,30));
		s.print();
	}
		

}
