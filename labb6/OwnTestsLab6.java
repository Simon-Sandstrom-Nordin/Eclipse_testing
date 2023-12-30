package Eclipse_testing.labb6;

import static org.junit.Assert.*;

import org.junit.Test;

public class OwnTestsLab6 {
	
	// NumberedItemTest0
    @Test
    public void testCompare() {
        NumberedItem<Integer> i1 = new NumberedItem<>(-1,1);   // note the diamond syntax
        NumberedItem<Integer> i2 = new NumberedItem<>(0,17);
        NumberedItem<Integer> i3 = new NumberedItem<>(5,100);
        NumberedItem<Integer> i4 = new NumberedItem<>(10,378);
        assertEquals(0, i1.compareTo(i2));
        assertEquals(-5, i3.compareTo(i4));
        assertEquals(5, i4.compareTo(i3));
    }
    
	// NumberedItemTest
    @Test
    public void testCompare1() {
    NumberedItem<Integer> i1 = new NumberedItem<>(-1,1);
    NumberedItem<Integer> i2 = new NumberedItem<>(0,17);
    NumberedItem<Integer> i3 = new NumberedItem<>(5,100);
    NumberedItem<Integer> i4 = new NumberedItem<>(10,378);
    NumberedItem<Integer> i5 = new NumberedItem<>(10,1729);
    assertEquals(0, i1.compareTo(i2));
    assertEquals(-5, i3.compareTo(i4));
    assertEquals(5, i4.compareTo(i3));
    assertEquals(0, i4.compareTo(i5));
    }
    @Test
    public void testEquals() {
    NumberedItem<Integer> i1 = new NumberedItem<>(-1,1);
    NumberedItem<Integer> i2 = new NumberedItem<>(0,1);
    NumberedItem<Integer> i3 = new NumberedItem<>(7,117);
    NumberedItem<Integer> i4 = new NumberedItem<>(7,4304);
    assertTrue(i1.equals(i2));
    assertTrue(i3.equals(i4));
    assertFalse(i2.equals(i3));
    assertFalse(i2.equals("XYZZY"));
    assertFalse(i2.equals(null));
    }
    
    // SpareseVec tests
    
    // SpareseVecA tests

    private SparseVecA<String> sparseVeca = new SparseVecA<String>();


    // Testing an empty SparseVec
    @Test
    public void testEmpty() {
        assertEquals(0, sparseVeca.size());
        assertEquals(-1, sparseVeca.minIndex());
        assertEquals(-1, sparseVeca.maxIndex());
        assertNull(sparseVeca.get(0));
        assertArrayEquals(new Object[0], sparseVeca.toArray());
        assertTrue(sparseVeca.sortedValues().isEmpty());
    }

    // Testing adding elements on specific positions
    @Test
    public void testAddOnSpecificPositions() {
        sparseVeca.add(2, "Hello");
        assertEquals(1, sparseVeca.size());
        assertEquals(2, sparseVeca.minIndex());
        assertEquals(2, sparseVeca.maxIndex());

        sparseVeca.add(2, "World"); // Overwrite the same index
        assertEquals(1, sparseVeca.size());

        sparseVeca.add(5, "Java");
        assertEquals(2, sparseVeca.size());
        assertEquals(2, sparseVeca.minIndex());
        assertEquals(5, sparseVeca.maxIndex());
    }

    // Testing adding elements on unspecified positions
    @Test
    public void testAddOnUnspecifiedPositions() {
        sparseVeca.add("First");
        sparseVeca.add("Second");
        assertEquals(2, sparseVeca.size());
        assertNotNull(sparseVeca.get(0));
        assertNotNull(sparseVeca.get(1));
        assertNull(sparseVeca.get(2));
    }

    // Testing remove functionality
    @Test
    public void testRemove() {
        sparseVeca.add(1, "RemoveMe");
        sparseVeca.add(3, "KeepMe");
        sparseVeca.removeAt(1);
        assertNull(sparseVeca.get(1));
        assertNotNull(sparseVeca.get(3));

        sparseVeca.removeElem("KeepMe");
        assertNull(sparseVeca.get(3));
    }
    
    // SpareseVecB tests
    private SparseVecB<String> sparseVecb = new SparseVecB<String>();;


    // Testing an empty SparseVec
    @Test
    public void testEmptyB() {
        assertEquals(0, sparseVecb.size());
        assertEquals(-1, sparseVecb.minIndex());
        assertEquals(-1, sparseVecb.maxIndex());
        assertNull(sparseVecb.get(0));
        assertArrayEquals(new Object[0], sparseVecb.toArray());
        assertTrue(sparseVecb.sortedValues().isEmpty());
    }

    // Testing adding elements on specific positions
    @Test
    public void testAddOnSpecificPositionsB() {
    	sparseVecb.add(2, "Hello");
        assertEquals(1, sparseVecb.size());
        assertEquals(2, sparseVecb.minIndex());
        assertEquals(2, sparseVecb.maxIndex());

        sparseVecb.add(2, "World"); // Overwrite the same index
        assertEquals(1, sparseVecb.size());

        sparseVecb.add(5, "Java");
        assertEquals(2, sparseVecb.size());
        assertEquals(2, sparseVecb.minIndex());
        assertEquals(5, sparseVecb.maxIndex());
    }

    // Testing adding elements on unspecified positions
    @Test
    public void testAddOnUnspecifiedPositionsB() {
    	sparseVecb.add("First");
    	sparseVecb.add("Second");
        assertEquals(2, sparseVecb.size());
        assertNotNull(sparseVecb.get(0));
        assertNotNull(sparseVecb.get(1));
        assertNull(sparseVecb.get(2));
    }

    // Testing remove functionality
    @Test
    public void testRemoveB() {
    	sparseVecb.add(1, "RemoveMe");
    	sparseVecb.add(3, "KeepMe");
    	sparseVecb.removeAt(1);
        assertNull(sparseVecb.get(1));
        assertNotNull(sparseVecb.get(3));

        sparseVecb.removeElem("KeepMe");
        assertNull(sparseVecb.get(3));
    }
    
}
