package aggregation;

public class Patient {
	String name;
	int age;
	Doctor d;  //reference variable
	public Patient(String name,int age,Doctor d) {
		this.name=name;
		this.age=age;
		this.d=d;
	}
public void display() {
	System.out.println(d.name+" "+d.dept);
	System.out.println(name+" "+age);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor obj=new Doctor("Anamika","Psychologist");
		Patient obj1=new Patient("Meenu",15,obj);
		obj1.display();

	}

}
