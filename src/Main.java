import Operations.*;
import Operations.Visitors.VisiteurRecursifConsole;
import Operations.Visitors.VisiteurSimpleConsole;
import Operations.Visitors.VisiteurSimpleConsole2;
import Operations.Visitors.Visitor;
import Operations.adapter.Bool2Valuable;
import Operations.adapter.MyBoolean;

public class Main {
    public static void main(String[] args) {
        mainComposite();

        mainVisitorUncomplete();

        mainVisitorSimple();

        mainVisitorSimpleConsole2();

        mainAdapter();

    }

    private static void mainComposite() {
        System.out.println("------------ Composite ------------" );

        Value value = new Value(5);
        System.out.println(value);
        System.out.println("La valeur de value est : " +value.getValue());
        Value value2 = new Value(10);

        Add add = new Add(value, value2);
        System.out.println("Add est un composite. C'est un Valuable qui contient deux Valuable (a et b)");
        System.out.println(add);
        System.out.println("La valeur de operation est : " +add.getValue());

        System.out.println("add est un Valuable -> on peut donc utiliser el polymorphisme et le mettre dans une variable de type Valuable");
        Valuable addAsValuable = add;
        System.out.println("en tant que valuable impossible d'acceder aux parametres a et b");
        //addAsValuable.getA();
        System.out.println("il est possible d'accéder à la valeur");
        System.out.println("La valeur de addAsValuable est : " +addAsValuable.getValue());

        System.out.println("Un composite peut contenir un autre composite. getValue et toString sont recursifs");
        Valuable composedAdd = new Add(value, add);
        System.out.println(composedAdd);
        System.out.println("La valeur de composedAdd est : " +composedAdd.getValue());

        System.out.println("Il est possible de combiner différentes opérations");
        Valuable mult = new Mult(composedAdd, new Div(value, value2));
        System.out.println(composedAdd);
        System.out.println("La valeur de composedAdd est : " +composedAdd.getValue());

    }

    private static void mainVisitorUncomplete() {
        System.out.println("---------\n-------\n------------ Visitor Not Complete ------------" );
        System.out.println("Initialisation de l'opération à visiter : ");
        // (3+(4/(2-1)))
        Valuable operation = new Add(new Value(3), new Div(new Value(4), new Sub(new Value(2), new Value(1))));
        System.out.println(operation);
        System.out.println("La valeur de operation est : " +operation.getValue());

        System.out.println("\n---------------------------------\n");
        System.out.println("\nInitialisation du visiteur : ");
        Visitor visitor = new VisiteurRecursifConsole();
        System.out.println("\nVisite de l'opération : ");
        operation.accept(visitor);
        System.out.println("!!!! Le visiteur n'a pas retourné de bon résultat parce que les méthodes visitDiv/Sub/Mult ne sont pas implémentées!!!!");

        System.out.println("\nLe visiteur fonctionne correctement sur les additions actuellement :");
        Valuable complexAdd = new Add(new Add(new Value(4), new Add(new Value(2), new Value(1))), new Add(new Value(30), new Value(11)));
        complexAdd.accept(visitor);
        System.out.println("\n\nTODO : implémenter les méthodes nécéssaire à l'affichage complet de l'opération");
        System.out.println("TODO : implémenter un second visiteur qui affiche l'opération sous la forme plus(3, div(4, moins(2, 1))). Cela nécéssite d'ajouter une interface Visitor et une seconde classe VisiteurRecursif2");
    }


    private static void mainVisitorSimple() {
        System.out.println("---------\n-------\n------------ Visitor Simple ------------" );
        System.out.println("Initialisation de l'opération à visiter : ");
        // (3+(4/(2-1)))
        Valuable operation = new Add(new Value(3), new Div(new Value(4), new Sub(new Value(2), new Value(1))));
        System.out.println(operation);
        System.out.println("La valeur de operation est : " +operation.getValue());

        System.out.println("\n---------------------------------");
        System.out.println("Initialisation du visiteur : ");
        Visitor visitor = new VisiteurSimpleConsole();
        System.out.println("Visite de l'opération : ");
        operation.accept(visitor);

        System.out.println("\nAddition complexe :");
        Valuable complexAdd = new Add(new Add(new Value(4), new Add(new Value(2), new Value(1))), new Add(new Value(30), new Value(11)));
        complexAdd.accept(visitor);
    }

    private static void mainVisitorSimpleConsole2() {
        System.out.println("---------\n-------\n------------ Visitor Simple 2------------" );
        System.out.println("Initialisation de l'opération à visiter : ");
        // (3+(4/(2-1)))
        Valuable operation = new Add(new Value(3), new Div(new Value(4), new Sub(new Value(2), new Value(1))));
        System.out.println(operation);
        System.out.println("La valeur de operation est : " +operation.getValue());

        System.out.println("\n---------------------------------");
        System.out.println("Initialisation du visiteur : ");
        Visitor visitor = new VisiteurSimpleConsole2();
        System.out.println("Visite de l'opération : ");
        operation.accept(visitor);

        System.out.println("\nAddition complexe :");
        Valuable complexAdd = new Add(new Add(new Value(4), new Add(new Value(2), new Value(1))), new Add(new Value(30), new Value(11)));
        complexAdd.accept(visitor);
    }

    private static void mainAdapter() {
        System.out.println("---------\n-------\n------------ Adapter------------" );
        System.out.println("Initialisation de l'opération booleenne : ");
        // true
        MyBoolean bool = new MyBoolean(true);
        Valuable operation = new Bool2Valuable(bool);
        System.out.println(operation);
        System.out.println("La valeur de operation est : " +operation.getValue());

        System.out.println("\n---------------------------------");
        System.out.println("Initialisation du visiteur : ");
        Visitor visitor = new VisiteurSimpleConsole2();
        System.out.println("Visite de l'opération : ");
        operation.accept(visitor);

    }
}
