package Operations;

import Operations.Visitors.Visitor;

public class Mult extends Operation {
    private Valuable a, b;

    public Mult(Valuable a, Valuable b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue() {
        return a.getValue() * b.getValue();
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public String toString() {
        return "Mult{" +
                "left=" + a +
                ", right=" + b +
                '}';
    }

}
