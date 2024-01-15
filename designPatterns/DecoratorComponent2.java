package Eclipse_testing.designPatterns;

public class DecoratorComponent2 extends DecoratorComponent1 {
	private int value = 1;
	private String name = "Jeff";
	
	public DecoratorComponent2(DecoratorInterface me) {
		super(me);
	}

	public int getValue() {
		return super.getValue() + value;
	}
	
	public String getName() {
		return super.getName() + " and " + name;
	}
	
}
