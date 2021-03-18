package oops_exe;

public class Encatulation {
	 private int id ;
	String name;
	int age;
	
	Encatulation()
	{
		System.out.println("this is the constructer");
	}
	
	Encatulation(int id ,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getid()
	{
		return id;
	}
	public void display() {
		System.out.print(this.id);
		System.out.print(this.name);
		System.out.print(this.age);
	}
	public static void main(String[] args) {
		Encatulation enc= new Encatulation(001, "mohan", 25);
		enc.display();
		
	}

}
