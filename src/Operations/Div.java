package Operations;

import Operations.Visitors.VisiteurRecursifConsole;

public class Div extends Operation {
    private Valuable a, b;

    public Div(Valuable a, Valuable b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue() {
        return a.getValue() / b.getValue();
    }

    @Override
    public void accept(VisiteurRecursifConsole visitor) {

    }

    @Override
    public String toString() {
        return "Div{" +
                "left=" + a +
                ", right=" + b +
                '}';
    }

}
