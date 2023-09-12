package Operations.adapter;

import Operations.Valuable;
import Operations.Visitors.Visitor;

public class Bool2Valuable implements Valuable {

    private MyBoolean bool;

    public Bool2Valuable(MyBoolean bool) {
        this.bool = bool;
    }

    @Override
    public double getValue() {
        if (bool.isTrue())
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Bool2Valuable{" +
                "bool=" + bool +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBool2Valuable(this);
    }


}
