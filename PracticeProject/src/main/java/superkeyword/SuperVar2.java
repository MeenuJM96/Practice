package superkeyword;

public class SuperVar2 extends SuperVar1 {
	String name="Instance Variable in child class";
	int x=50;
	public void disp() {
		System.out.println(name);
		System.out.println(x);
		System.out.println(super.name);
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVar2 obj=new SuperVar2();
		obj.disp();
	}

}
