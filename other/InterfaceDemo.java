public class InterfaceDemo {
	public static void main(String[] args) {
		Computer lap=new Laptop();
		Computer desk=new Desktop();
		Employee emp=new Employee();
		emp.doJob(lap);
		// emp.doWork(desk);
	}
}
interface Computer{
	void doWork();
}
class Laptop implements Computer{
	public void doWork(){
		System.out.println("Working with Laptop...");
	}
}

class Desktop implements Computer{
	public void doWork(){
		System.out.println("Working with Desktop...");
	}
}
class Employee{
	public void doJob(Computer comp){
		comp.doWork();
	}
}