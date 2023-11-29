package Eclipse_testing.labb4;

public class Leaf implements Component {
	
	private float weight;
	private String name;
	
	public Leaf(float inputWeight, String inputName) {
		this.weight = inputWeight;
		this.name = inputName;
	}
	
	@Override
	public float getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public void Add(Component component) {}

	@Override
	public void Remove(Component component) {}

	@Override
	public Component GetChild(Component component) {return component;}
	
}
