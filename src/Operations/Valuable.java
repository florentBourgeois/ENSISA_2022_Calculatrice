package Operations;

public interface Valuable {
    double getValue();
    void accept(Visitor visitor);
}
