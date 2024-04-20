package inheritance;

public class MultiExC extends MultiExB{
	public void print() {
		System.out.println("Multilevel Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiExC obj=new MultiExC();
		obj.print();
		obj.add();
		obj.disp();
	}

}
