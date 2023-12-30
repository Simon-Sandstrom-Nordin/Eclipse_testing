package Eclipse_testing.labb4;

import Eclipse_testing.labb4.human.Human;

public class TestFactory {
	
	public static void main(String []args) {
		System.out.println("Testing humans");
		String pnr1 = "000101-0000";	// Non-binary
		Human nb = Human.create("nb", pnr1);
		System.out.println(nb.gender);
		System.out.println(pnr1.charAt(9));
		
		String pnr2 = "000101-0020";	// Non-binary
		Human man = Human.create("man", pnr2);
		System.out.println(man.gender);
		System.out.println(pnr2.charAt(9));
		
		String pnr3 = "000101-0010";	// Non-binary
		Human wom = Human.create("wom", pnr3);
		System.out.println(wom.gender);
		System.out.println(pnr3.charAt(9));
		
		// Vahid's test program
		Human billie = Human.create("Billie", "xxxxxx-560x");
		Human anna = Human.create("Anna", "xxxxxx-642x");
		Human magnus = Human.create("Magnus","xxxxxx-011x");
		System.out.println(billie);
		System.out.println(anna);
		System.out.println(magnus);
		

		
		// BELOW CODE DOESN'T COMPILE WHEN UNCOMMENTED
		
		// try do do illegal things:
		// create an object of an anonymous subclass of human
		//try {
		//	Human h = new Human(){};
		//	System.out.println("object illegally created");
		//} catch (Exception e) {
		//	 System.out.println(e);
		//}
		
		// create a non-binary illegally
		// Human nbObj = new Nonbinary();

		// create a man illegally
		// Human manObj = new Man();

		// create a woman illegally
		// Human womObj = new Woman();

	}

}
