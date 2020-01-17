package space;

import java.util.function.Supplier;

public class ValueHolder<T> {
    private T value = null;
    private Supplier<T> supplier;

    public ValueHolder(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T getValue() {
        if (value == null){
            value = this.supplier.get();
            System.out.println("Now the supplier fetches the data! " + value);
        }
        return value;
    }

    @Override
    public String toString() {
        return "ValueHolder{" +
                "value=" + value +
                '}';
    }
}
