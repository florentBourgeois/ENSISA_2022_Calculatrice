package Operations.Visitors;

import Operations.*;

public class VisiteurRecursifConsole implements Visitor{
    public void visitValue(Value v) {
        System.out.print(v.getValue());
    }
    public void visitAdd(Add add) {
        System.out.print("(");
        add.getA().accept(this);
        System.out.print(" + ");
        add.getB().accept(this);
        System.out.print(")");
    }

    @Override
    public void visitSub(Sub sub) {
        System.out.println("sub not implemented");
    }

    @Override
    public void visitMult(Mult mult) {
        System.out.println("mult not implemented");
    }

    @Override
    public void visitDiv(Div div) {
        System.out.println("div not implemented");
    }

    public static void main(String[] args) {
        Valuable a = new Value(10) ;
        VisiteurRecursifConsole visitor = new VisiteurRecursifConsole();
        System.out.print("Visiteur recursif console : value 10 generates -> ");
        a.accept(visitor);
        System.out.println("\n");

        Valuable b = new Value(20) ;
        Valuable add = new Add(a,b) ;
        System.out.print("Visiteur recursif console : add generates -> ");
        add.accept(visitor);
    }


}
