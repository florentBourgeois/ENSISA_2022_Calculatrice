package Operations;

import Operations.Visitors.Visitor;

public interface Valuable {
    double getValue();
    void accept(Visitor visitor);
}
