package Operations.Visitors;

import Operations.*;
import Operations.adapter.Bool2Valuable;

public interface Visitor {

    public void visitValue(Value v);
    public void visitAdd(Add add);
    public void visitSub(Sub sub);
    public void visitMult(Mult mult);
    public void visitDiv(Div div);

    void visitBool2Valuable(Bool2Valuable bool2Valuable);
}
