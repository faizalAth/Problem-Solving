// Outer class in Inner class...
// Outer class Method in Inner class...
// Outer class in Static Inner class...
// Anonymous Inner Classes...

public class InnerClass {
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.eat();

		Dog.Puppy puppy=dog.new Puppy();
		puppy.drink();
	}
}
class Dog{
	public int legs;
	public void eat(){
		System.out.println("Dog Eating Food...!");
		class Chapati{
			public Chapati(){
				System.out.println("Chapati...!");
			}
		}
		new Chapati();
	}
	class Puppy{
		String name;
		public void drink(){
			System.out.println("Puppy Drinking Water...!"+legs);
		}
	}
}