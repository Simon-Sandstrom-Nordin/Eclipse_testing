package Eclipse_testing.labb4;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	private float ownWeight;
	private String ownName;

	private List<Component> children = new ArrayList<Component>();
	
	public Composite(float inputWeight, String inputName) {
		ownWeight = inputWeight;
		ownName = inputName;
	}
	
	@Override
	public float getWeight() {
		float weight = ownWeight;
		for (Component child: children) {
			weight += child.getWeight();
		}
		return weight;
	}

	
	@Override
	public String toString() {
		String names = ownName + " ";
		for (Component child: children) {
			names += child + " ";
		}
		return names;
	}
	
	@Override
	public void Add(Component component) {
		children.add(component);
	}

	@Override
	public void Remove(Component component) {
		children.remove(component);
	}

	@Override
	public Component GetChild(Component component) {
		if (children.contains(component)) {
			return component;
		} else {
			return null;
		}
		
	}

}
