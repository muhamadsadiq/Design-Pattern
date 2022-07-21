package strategypattern;

public interface Flys {
    String fly();
}

class ItFlys implements Flys{


    public String fly() {
        return "Flying High";
    }
}
class CantFlys implements Flys{


    public String fly() {
        return "I Can't Fly";
    }
}
