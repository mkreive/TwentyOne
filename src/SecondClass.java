public class SecondClass implements IntUser, DoubleUser, Guess<SecondClass>{
    @Override
    public void use(double num) {

    }

    @Override
    public void use(int num) {

    }

    @Override
    public boolean check(SecondClass num) {
        return false;
    }
}
