package inheritance;

class a //grand parent class.
{
	void ab()
	{
		System.out.println("Print 1");
	}
	static void ac()
	{
		System.out.println("Print 2");
	}
}
class b extends a//parent class.
{
	void ad()
	{
		System.out.println("Print 3");
	}
	static void ae()
	{
		System.out.println("Print 4");
	}
}

public class Multi_Level_Syntax extends b {
	
	void af()
	{
		System.out.println("Print 5");
	}
	static void ag()
	{
		System.out.println("Print 6");
	}
	
	public static void main(String[] args) {
		
		Multi_Level_Syntax m1 = new Multi_Level_Syntax();
		
		m1.ab();
		ac();
		m1.ad();
		ae();
		m1.af();
		ag();
		
		
	}

}
