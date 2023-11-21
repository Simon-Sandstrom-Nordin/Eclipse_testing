package Eclipse_testing.ex4;

class Test {

	public static void main(String []args) {
		Test t_obj = new Test();
		System.out.println("wa");
		System.out.println(mA());
		// System.out.println(mB());
		// System.out.println(mC());
		// System.out.println(mD());
		System.out.println(t_obj.mB());
		// System.out.println(t_obj.mC());
		System.out.println(t_obj.mD());
		
	}
	
    static int sv = 17;
    int iv = 42;

    static int mA () {
        return sv;
    }

    int mB () {
        return sv;
    }

    static int mC () {
        // return iv;
    	return 5;
    }

    public int mD() {
        return iv;
    }
}

/*
static:
https://stackoverflow.com/questions/413898/what-does-the-static-keyword-do-in-a-class
652
static members belong to the class instead of a specific instance.
It means that only one instance of a static field exists[1] even if you create a million instances of the class or you don't create any. It will be shared by all instances.
Since static methods also do not belon
*/
