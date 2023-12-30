package Eclipse_testing.labb6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class SparseVecB<E extends Comparable<E>> extends TreeMap<Integer, E> implements SparseVec<E> {

	public static void main(String []args) {
		SparseVecB<String> sB = new SparseVecB<String>();
		//sA.add(3, "three");
		//sA.add(5, "five");
		//sA.add(4, "four");
		//sA.add("waaaaaaaa");
		//sA.add("wooooo");
		//System.out.println(sA);
		//System.out.println(sA.sortedValues());
		//System.out.println(sA.toArray());
		

        // Adding at least five values
        sB.add(5, "tree");
        sB.add(3, "five");
        sB.add(4, "four");
        sB.add("wwaaaaaaa");
        sB.add("wooooo");

        // Testing toString()
        System.out.println("Vector contents using toString():");
        System.out.println(sB);

        // Testing toArray()
        System.out.println("\nVector contents using toArray():");
        Object[] arrayRepresentation = sB.toArray();
        for (Object elem : arrayRepresentation) {
            System.out.print(elem + " ");
        }
        System.out.println();

        // Testing sortedValues()
        System.out.println("\nSorted values of the vector:");
        System.out.println(sB.sortedValues());
		
	}
	
	
	@Override
	public void add(E elem) {
        int index = 0;
        while (this.containsKey(index)) {
            index++;
        }
        this.put(index, elem);
    }

	@Override
	public void add(int pos, E elem) {
		 if (pos < 0) pos = 0;
		 this.put(pos, elem);
	}

	@Override
    public int indexOf(E elem) {
        for (Integer key : this.keySet()) {
            if (this.get(key).equals(elem)) {
                return key;
            }
        }
        return -1;
    }

	@Override
	public void removeAt(int pos) {
		this.remove(pos);
	}

	@Override
	public void removeElem(E elem) {
        int index = indexOf(elem);
        if (index != -1) {
        	this.remove(index);
        }
	}

	@Override
	public int size() {
		return super.size();
	}

	@Override
	public int minIndex() {
		return this.isEmpty() ? -1 : this.firstKey();
	}

	@Override
	public int maxIndex() {
        return this.isEmpty() ? -1 : this.lastKey();
	}
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer key : this.keySet()) {
            sb.append("Index ").append(key)
              .append(": ").append(this.get(key)).append("\n");
        }
        return sb.toString();
    }
    
	@Override
	public E get(int pos) {
		return super.get(pos);
	}

    @Override
    public Object[] toArray() {
        Object[] array = new Object[maxIndex() + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.get(i);
        }
        return array;
    }

    @Override
    public List<E> sortedValues() {
        return new ArrayList<>(this.values());
    }
	

}
