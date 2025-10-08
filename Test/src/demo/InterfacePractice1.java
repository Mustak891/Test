package demo;

public interface InterfacePractice1 {

	void name();

	default void myAnimal() {
		String name1 = "vijay1";
		System.out.println("InterfacePractice " + name1);
	}
}
