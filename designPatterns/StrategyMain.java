package Eclipse_testing.designPatterns;

public class StrategyMain {
	
	public static void main(String[] args) {
		StrategyInterface s1 = new Strategy1();
		StrategyInterface s2 = new Strategy2();
		StrategyContext context = new StrategyContext(s1);
		
		context.excecuteStrategy();
		context.setStrategy(s2);
		context.excecuteStrategy();
		
	}
	
}
