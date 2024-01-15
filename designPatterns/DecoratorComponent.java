package Eclipse_testing.designPatterns;

public class DecoratorComponent implements DecoratorInterface {
	private int value = 5;
	private String name = "My name is Simon";
	
	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
