package Operations;

public abstract class Operation implements Valuable {
    protected Valuable a, b;

    public Operation(Valuable a, Valuable b) {
        this.a = a;
        this.b = b;
    }

    public Valuable getA() {
        return a;
    }

    public Valuable getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
