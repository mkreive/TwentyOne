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


