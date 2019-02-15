package demo;

public class Child extends Parent {
	private char[] parent;

	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		System.out.println(c.parent);
		
	}
}
