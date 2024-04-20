package inheritance;

public class HierarchExC extends HierarchExA{
	String name="Meenu";
	int empId=20148;
	String desig="Supervisor";
	public void empDetail() {
		System.out.println("Name : "+name);
		System.out.println("Employee Id No : "+empId);
		System.out.println("Designation : "+desig);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchExC obj=new HierarchExC();
		obj.empDetail();
		obj.dispSal();
	}

}
