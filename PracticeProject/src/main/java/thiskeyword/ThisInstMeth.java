package thiskeyword;

public class ThisInstMeth {
	String stName="Abhirami";
	int IdNo=20418;
	int totmarks;
	public void data() {
		System.out.println("Student Details..");
		System.out.println("Name : "+stName);
		System.out.println("Id No : "+IdNo);
		this.marks();
		this.grade(totmarks);
	}
	public void marks() {
		int s1mark=485;
		int s2mark=493;
		System.out.println("Sem1 marks : "+s1mark);
		System.out.println("Sem2 marks : "+s2mark);	
		totmarks=s1mark+s2mark;
		System.out.println("Total marks: " +totmarks);
	}
	public void grade(int totmarks) {
		if(totmarks>1000)
		{
		System.out.println("Invalid input");
		}
		else if (totmarks>800)
		{
		System.out.println("A Grade"); 
		}
		else if(totmarks>700)
		{
		System.out.println("B Grade");
		}
		else if(totmarks>600)
		{
		System.out.println("C Grade");
		}
		else if(totmarks>=500)
		{
		System.out.println("D Grade");
		}
		else
		{
		System.out.println("Failed..");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisInstMeth obj=new ThisInstMeth();
		obj.data();
	}

}
