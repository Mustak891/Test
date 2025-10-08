package demo;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
		System.out.println("Person created: " + name);
	}
}


class Employee extends Person {
	Employee(String name){
		super(name);
	}
}

public class PracticeSuper {

	public static void main(String[] args) {
		Employee e1 = new Employee("John");
//		System.out.println("Employee name: " + e1.name);
	}

}
