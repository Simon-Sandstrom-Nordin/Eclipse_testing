package Eclipse_testing.labb6;

import java.util.Objects;

public class NumberedItem<T> implements Comparable<NumberedItem<T>> {
    private int index;
    private T item;

    public NumberedItem(int index, T item) {
        this.item = item;
        this.index = Math.max(index, 0);
    }
    
    public int getIndex() {
        return index;
    }

    public T getItem() {
        return item;
    }

    @Override
    public int compareTo(NumberedItem<T> other) {
        return this.index - other.getIndex();
    }

    @Override
    public String toString() {
        return "NumberedItem - Index: " + index + ", Item: " + item.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberedItem<?> that = (NumberedItem<?>) o;
        return index == that.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
    
}
