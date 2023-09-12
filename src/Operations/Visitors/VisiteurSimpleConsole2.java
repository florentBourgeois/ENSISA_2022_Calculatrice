package Operations.Visitors;

import Operations.*;

public class VisiteurSimpleConsole2 implements Visitor {


    @Override
    public void visitValue(Value v) {
        System.out.print(v.getValue());
    }

    @Override
    public void visitAdd(Add op) {
        System.out.print("plus(");
        op.getA().accept(this);
        System.out.print(", ");
        op.getB().accept(this);
        System.out.print(")");
    }

    @Override
    public void visitSub(Sub op) {
        System.out.print("sub(");
        op.getA().accept(this);
        System.out.print(", ");
        op.getB().accept(this);
        System.out.print(")");
    }

    @Override
    public void visitMult(Mult op) {
        System.out.print("mult(");
        op.getA().accept(this);
        System.out.print(", ");
        op.getB().accept(this);
        System.out.print(")");
    }

    @Override
    public void visitDiv(Div op) {
        System.out.print("div(");
        op.getA().accept(this);
        System.out.print(", ");
        op.getB().accept(this);
        System.out.print(")");
    }
}
