package Operations;

public class Sub extends Operation {
    private Valuable a, b;

    public Sub(Valuable a, Valuable b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue() {
        return a.getValue() - b.getValue();
    }

    @Override
    public String toString() {
        return "Sub{" +
                "left=" + a +
                ", right=" + b +
                '}';
    }

}
