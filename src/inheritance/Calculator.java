package inheritance;

public class Calculator implements Operation {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		System.out.println("add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated mehod stub
		Calculator calculator = new Calculator();
		System.out.println("sub");
	
		
	}
	System.out.println(add());
	
}
