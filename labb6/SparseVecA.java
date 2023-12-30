package Eclipse_testing.labb6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class SparseVecA<E extends Comparable<E>> implements SparseVec<E> {
	
	private TreeMap<Integer, E> treeMap = new TreeMap<>();

	public static void main(String []args) {
		SparseVecA<String> sA = new SparseVecA<String>();
		//sA.add(3, "three");
		//sA.add(5, "five");
		//sA.add(4, "four");
		//sA.add("waaaaaaaa");
		//sA.add("wooooo");
		//System.out.println(sA);
		//System.out.println(sA.sortedValues());
		//System.out.println(sA.toArray());
		

        // Adding at least five values
        sA.add(5, "three");
        sA.add(3, "five");
        sA.add(4, "four");
        sA.add("wwaaaaaaa");
        sA.add("wooooo");

        // Testing toString()
        System.out.println("Vector contents using toString():");
        System.out.println(sA);

        // Testing toArray()
        System.out.println("\nVector contents using toArray():");
        Object[] arrayRepresentation = sA.toArray();
        for (Object elem : arrayRepresentation) {
            System.out.print(elem + " ");
        }
        System.out.println();

        // Testing sortedValues()
        System.out.println("\nSorted values of the vector:");
        System.out.println(sA.sortedValues());
		
	}
	
	
	@Override
	public void add(E elem) {
        int index = 0;
        while (treeMap.containsKey(index)) {
            index++;
        }
        treeMap.put(index, elem);
    }

	@Override
	public void add(int pos, E elem) {
		 if (pos < 0) pos = 0;
		treeMap.put(pos, elem);
	}

	@Override
    public int indexOf(E elem) {
        for (Integer key : treeMap.keySet()) {
            if (treeMap.get(key).equals(elem)) {
                return key;
            }
        }
        return -1;
    }

	@Override
	public void removeAt(int pos) {
		treeMap.remove(pos);
	}

	@Override
	public void removeElem(E elem) {
        int index = indexOf(elem);
        if (index != -1) {
            treeMap.remove(index);
        }
	}

	@Override
	public int size() {
		return treeMap.size();
	}

	@Override
	public int minIndex() {
		return treeMap.isEmpty() ? -1 : treeMap.firstKey();
	}

	@Override
	public int maxIndex() {
        return treeMap.isEmpty() ? -1 : treeMap.lastKey();
	}
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer key : treeMap.keySet()) {
            sb.append("Index ").append(key)
              .append(": ").append(treeMap.get(key)).append("\n");
        }
        return sb.toString();
    }

	@Override
	public E get(int pos) {
		return treeMap.get(pos);
	}

    @Override
    public Object[] toArray() {
        Object[] array = new Object[maxIndex() + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = treeMap.get(i);
        }
        return array;
    }

    @Override
    public List<E> sortedValues() {
        return new ArrayList<>(treeMap.values());
    }
	

}
