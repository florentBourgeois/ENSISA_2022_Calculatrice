package Operations;

import Operations.Visitors.Visitor;

public class Add extends Operation {
    private Valuable a, b;

    public Add(Valuable a, Valuable b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue() {
        return a.getValue() + b.getValue();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAdd(this);
    }

    @Override
    public String toString() {
        return "Add{" +
                "left=" + a +
                ", right=" + b +
                '}';
    }

}
