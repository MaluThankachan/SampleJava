package StudyTime;

public class SuperParent 
{
	int d= 10;
	int length;
	int breadth;
	int area1;
	public SuperParent()
	{
		System.out.println("This is parent constructor called frm child class using super keyword");
	}
	public int area(int length, int breadth)
	{
		
		this.length = length;
		this.breadth =  breadth;
		area1 = length*breadth;
		return area1;
	}
	
	void display()
	{
		System.out.println("This is parent method");
	}

}
