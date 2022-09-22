package Operations;

import Operations.Visitors.VisiteurRecursifConsole;

public interface Valuable {
    double getValue();
    void accept(VisiteurRecursifConsole visitor);
}
