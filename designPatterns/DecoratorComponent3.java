package Eclipse_testing.designPatterns;

public class DecoratorComponent3 extends DecoratorComponent1 {
	private int value = 3;
	private String name = "Wen";
	
	public DecoratorComponent3(DecoratorInterface me) {
		super(me);
	}

	public int getValue() {
		return super.getValue() + value;
	}
	
	public String getName() {
		return super.getName() + " and " + name;
	}
	
}
