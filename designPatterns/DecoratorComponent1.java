package Eclipse_testing.designPatterns;

abstract class DecoratorComponent1 implements DecoratorInterface {
	protected final DecoratorInterface Me; 
	
	public DecoratorComponent1(DecoratorInterface me) {
		Me = me;
	}
	
	@Override
	public int getValue() {
		return Me.getValue();
	}

	@Override
	public String getName() {
		return Me.getName();
	}
	
}
