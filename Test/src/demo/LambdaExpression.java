package demo;

interface A {
	
	void display();
	
}

interface B{
	void display1();
	void display2();
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		A obj = ()-> {
				System.out.println("Hello lamda");
		};
		
		obj.display();
		
		
		B obj1= new B() {

			@Override
			public void display1() {
			  System.out.println("Hello display");
			}

			@Override
			public void display2() {
				System.out.println("system");
			}
		};
		
		obj1.display1();
		obj1.display2();
		
	}

}
