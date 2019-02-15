package com.abc;

public class Test extends Demo2{

	public static void main(String[] args) {
		
		Demo2 d=new Demo2();
		
		System.out.println(d.num=12);
		d.show();
		d.display();
		
		
	}
	void show()
	{
		int a=19;
		int b=23;
		int c=b-a;
		System.out.println("overridden method: " +c);
	}

}
