package demo;

class Child1 implements InterfacePractice, InterfacePractice1{

	@Override
	public void animal() {
		System.out.println("animal");
	}

	@Override
	public void name() {
		
		System.out.println("My name");
		
	}
	
}

public class InterfacePractice2 {

	public static void main(String[] args) {
		
		Child1 child = new Child1();
		child.animal();
		child.name();

		InterfacePractice.myAnimal();
		child.myAnimal();

	}

	

}
