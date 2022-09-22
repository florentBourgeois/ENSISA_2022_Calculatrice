package Operations.Visitors;

import Operations.Add;
import Operations.Valuable;
import Operations.Value;

public class Visitor {
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


    public static void main(String[] args) {
        Valuable a = new Value(10) ;
        Visitor visitor = new Visitor();

        a.accept(visitor);


        Valuable b = new Value(20) ;

        Valuable add = new Add(a,b) ;

        add.accept(visitor);

    }


}
