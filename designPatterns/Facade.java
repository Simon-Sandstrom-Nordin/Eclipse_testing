package Eclipse_testing.designPatterns;

public class Facade {

	private FacadeSubClass1 A;
	private FacadeSubClass2 B;
	
	public Facade() {
		this.A = new FacadeSubClass1();
		this.B = new FacadeSubClass2();
	}
	
	public void doSmth() {
		System.out.println(A.doA());
		System.out.println(B.doB());
	}
	
	public static void main(String[] args) {
		Facade F = new Facade();
		F.doSmth();
	}
	
}
