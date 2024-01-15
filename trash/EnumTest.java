package Eclipse_testing.trash;

public class EnumTest {

	public enum letter{a, b, c};
	
	public static void main(String []args) {
		letter le = letter.a;
		System.out.println(le);
		
		letter le1 = letter.a;
		letter le2 = letter.a;
		System.out.println(le1 == le2);
		System.out.println(le1.equals(le2));
		le2 = letter.b;
		System.out.println(le1 == le2);
		System.out.println(le1.equals(le2));
	}
	
	
}
