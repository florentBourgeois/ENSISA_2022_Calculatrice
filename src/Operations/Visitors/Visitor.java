package Operations.Visitors;

import Operations.*;

public interface Visitor {

    public void visitValue(Value v);
    public void visitAdd(Add add);
    public void visitSub(Sub sub);
    public void visitMult(Mult mult);
    public void visitDiv(Div div);


}
