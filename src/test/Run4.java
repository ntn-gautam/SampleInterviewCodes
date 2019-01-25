package test;

public class Run4 {
	
	static int i;
	int j;
	
	static{
	i=10;
	System.out.println("Static block called");
	}
	
	{
		j=10;
		System.out.println("Initializor block");
	}
	
	Run4(){
	System.out.println("Constructor called");	
	}

	public static void main(String ... args) {
		
		System.out.println(new Run4());
		
		
		
		

	}

}
