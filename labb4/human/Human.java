package Eclipse_testing.labb4.human;

public abstract class Human {
	public String name;
	public String gender;
	
    Human() {}
	
	// factory method
	final public static Human create (String inputName, String pnr) {
		Human humanObject;
		if (pnr.charAt(9) == '0') {
			humanObject = new Nonbinary();
			humanObject.gender = "non-binary";	
		} else if (pnr.charAt(9) % 2 == 1) {
			humanObject = new Man();
			humanObject.gender = "man";
		} else {
			humanObject = new Woman();
			humanObject.gender = "woman";
		}

		humanObject.name = inputName;
		return humanObject;
	}

	@Override
	public String toString() {
		return "I'm a " + gender + " and my name is " + name;
	}
	
}
