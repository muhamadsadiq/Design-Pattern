package strategypattern;

public class Dog extends Animal{
    public void digHole(){
        System.out.println("dug a hole");
    }
    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CantFlys();
    }
}
