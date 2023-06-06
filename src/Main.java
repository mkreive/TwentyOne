public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        doSomething(cat);
        doSomething(() -> System.out.println("Meow from lambda"));

        Actions sum = (x, y) -> System.out.println(x + y);
        Actions diff = (x, y) -> System.out.println(x - y);
        Actions multi = (x, y) -> System.out.println(x * y);
        Actions divide = (x, y) -> System.out.println(x / y);

        sum.action(2,3);
        diff.action(9,5);
        multi.action(5,5);
        divide.action(100,2);
        System.out.println("_".repeat(50));

        IntUser integerUser = x -> System.out.println(x);
        DoubleUser doubleUser = x -> System.out.println(x);
        Guess guessUser = x -> x.equals(0);

        integerUser.use(4);
        doubleUser.use(5.9);
        System.out.println(guessUser.check(0));
        System.out.println(guessUser.check(9.9));
        System.out.println("_".repeat(50));







    }

    static void doSomething(Printable obj) {
        obj.printIt();
    }

}


class Cat implements Printable{
    @Override
    public void printIt() {
        System.out.println("Meow from class");
    }
}


