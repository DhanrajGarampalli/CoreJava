package inheritance;

public class MLI_main  extends MLI2 {
	
	void mod()
	{
		System.out.println("modulo logic");
	}
	
	public static void main(String[] args) {
		
		MLI_main m1 = new MLI_main();
		
		m1.add();
		sub();
		m1.mul();
		div();
		m1.mod();
		
		
	}

}
