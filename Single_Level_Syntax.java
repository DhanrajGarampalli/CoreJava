package inheritance;

 class second //Parent class.
{
	static void car()
	{
		
	}
	static void house()
	{
		
	}
	 void bike()
	{
																			
	}
}

public class Single_Level_Syntax extends second{ //Sub class.
	
	static void mobile()
	{
		
	}
	void watch()
	{
		
	}
	
	public static void main(String[] args) {
		
		mobile();
		Single_Level_Syntax p = new Single_Level_Syntax();
		p.watch();
		
				
		car();
		house();
		p.bike();
		
	}

}
