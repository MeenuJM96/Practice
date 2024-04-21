package superkeyword;

public class SuperMethEx2 extends SuperMethEx1 {
	public void add() {
	int a=125;
	int b=250;
	int c=a+b;
	System.out.println("Child Class");
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("Sum="+c);
	super.add();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethEx2 obj=new SuperMethEx2();
		obj.add();
	}

}
