package Operations;

import Operations.Visitors.Visitor;

public class Value implements Valuable {
    private double value;

    public Value(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitValue(this);
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }
}
