package inheritance;

public class Students extends Teacher{
	
	static void add()
	{
		System.out.println("It is addition from student class-static");
	}
	void sub()
	{
		System.out.println("It is substraction from student class-non static");
	}
	
	public static void main(String[] args) {
		
		add();//static method from same class.
		mul();//static method from other class.
		
		//To call non static methods from same/other class, need to create an object with child class name.
		Students s1 = new Students();
		
		s1.sub();//non static from same class.		
		s1.div();//non static method from other class.
		
		
	}

}
