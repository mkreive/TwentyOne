public class FirstClass implements IntUser, DoubleUser, Guess<FirstClass>{
    @Override
    public void use(double num) {
    }

    @Override
    public void use(int num) {

    }

    @Override
    public boolean check(FirstClass num) {
        return false;
    }
}
