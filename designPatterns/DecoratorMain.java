package Eclipse_testing.designPatterns;

public class DecoratorMain {

	public static void main(String []args) {
		DecoratorInterface me = new DecoratorComponent();
		System.out.println("Value: " + me.getValue() + ". Name: " + me.getName());
		
		me = new DecoratorComponent2(me);
		System.out.println("Value: " + me.getValue() + ". Name: " + me.getName());
		
		me = new DecoratorComponent3(me);
		System.out.println("Value: " + me.getValue() + ". Name: " + me.getName());
		
	}
	
}
