package Eclipse_testing.examTest;

import java.util.ArrayList;
import java.util.Collections;

public class TestObj implements Comparable<TestObj> {
    int num;

    TestObj(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(TestObj otherObj) {
        // Compare based on the 'num' field
        return Integer.compare(this.num, otherObj.num);
    }

    public static void main(String[] args) {
        TestObj obj1 = new TestObj(5);
        TestObj obj2 = new TestObj(10);
        ArrayList<TestObj> li = new ArrayList<>();

        li.add(obj1); // Add obj1 to the ArrayList
        li.add(obj2); // Add obj2 to the ArrayList

        Collections.sort(li);

        // Access elements using get(index)
        System.out.println(li.get(0).num); // Prints the 'num' of the first element after sorting
        System.out.println(li.get(1).num); // Prints the 'num' of the second element after sorting
        
        // Comparing objects using compareTo method
        int comparisonResult = obj1.compareTo(obj2);

        if (comparisonResult < 0) {
            System.out.println("obj1 is smaller than obj2");
        } else if (comparisonResult > 0) {
            System.out.println("obj1 is greater than obj2");
        } else {
            System.out.println("obj1 is equal to obj2");
        }
    }
}
