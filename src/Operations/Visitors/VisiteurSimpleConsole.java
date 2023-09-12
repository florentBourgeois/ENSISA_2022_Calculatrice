package Operations.Visitors;

import Operations.*;
import Operations.adapter.Bool2Valuable;

public class VisiteurSimpleConsole implements Visitor {


    @Override
    public void visitValue(Value v) {
        System.out.print(v.getValue());
    }

    @Override
    public void visitAdd(Add op) {
        System.out.print("(");
        op.getA().accept(this);
        System.out.print(" + ");
        op.getB().accept(this);
        System.out.print(")");
    }

    @Override
    public void visitSub(Sub op) {
        System.out.print("(");
        op.getA().accept(this);
        System.out.print(" - ");
        op.getB().accept(this);
        System.out.print(")");
    }

    @Override
    public void visitMult(Mult op) {
        System.out.print("(");
        op.getA().accept(this);
        System.out.print(" * ");
        op.getB().accept(this);
        System.out.print(")");
    }

    @Override
    public void visitDiv(Div op) {
        System.out.print("(");
        op.getA().accept(this);
        System.out.print(" / ");
        op.getB().accept(this);
        System.out.print(")");
    }

    @Override
    public void visitBool2Valuable(Bool2Valuable bool2Valuable) {
        System.out.println(bool2Valuable.getValue());
    }


}
