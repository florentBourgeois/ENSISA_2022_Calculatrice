package Operations;

import Operations.Visitors.VisiteurRecursifConsole;

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
    public void accept(VisiteurRecursifConsole visitor) {
        visitor.visitValue(this);
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }
}
