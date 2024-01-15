package Eclipse_testing.designPatterns;

class StrategyContext {
	private StrategyInterface strategy;
	
	public StrategyContext(StrategyInterface strategy) {
		this.strategy = strategy;
	}
	
	public void setStrategy(StrategyInterface strategy) {
		this.strategy = strategy;
	}
	
	
	public void excecuteStrategy() {
		strategy.printText();
	}
	
}
