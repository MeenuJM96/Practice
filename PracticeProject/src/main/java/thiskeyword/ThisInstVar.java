package thiskeyword;

public class ThisInstVar {
	String name;
	int age;
	public void disp(String name,int age) {
		this.name=name;
		this.age=age;
			System.out.println("Name : "+name);	
			System.out.println("Age : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisInstVar obj=new ThisInstVar();
		obj.disp("Anamika",18);
		obj.disp("Abhirami", 20);
		obj.disp("Adithya", 22);
		obj.disp("Meenu", 21);
	}
}
