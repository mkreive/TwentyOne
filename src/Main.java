import java.time.Year;

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

        Clubbing willGoToClub = years -> {
            int age = Year.now().getValue() - years;
            if(age >= 18 && age < 80 && age % 2 == 0 && age % 5 == 0) {
                return true;
            }
            return false;
        };

//        System.out.println(willGoToClub.check(1986));
//        System.out.println(willGoToClub.check(1983));

        System.out.println(checkClubbing(willGoToClub, 1986));
        System.out.println(checkClubbing(willGoToClub, 2013));
        System.out.println(checkClubbing(willGoToClub, 1923));
        System.out.println(checkClubbing(willGoToClub, 2003));
        System.out.println(checkClubbing(willGoToClub, 1993));

    }

    static boolean checkClubbing(Clubbing clubbing, int years) {
        return clubbing.check(years);
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


