package strategypattern;

public class Main {

    public static void main(String[] args) {
        Animal dogy = new Dog();

        System.out.println(dogy.tryToFly());

        Animal tweety = new Bird();

        System.out.println(tweety.tryToFly());
    }
}
