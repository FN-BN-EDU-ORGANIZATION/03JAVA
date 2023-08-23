package HomeWork.C20230823;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class C20230823 {
	
	public static void changeDog(Animal animal) 
	{	
		try {
		Dog down = (Dog)animal;
		}catch(ClassCastException e) {
			System.out.println("Cast예외발생!");
		}
	}
	
	public static void main(String[] args) {
		
		Animal poppi = new Dog();
		
		Animal yummi = new Cat();
		
		changeDog(poppi);
		changeDog(yummi);
	}
}
