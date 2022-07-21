package strategypattern;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flys flyingType;

    public Animal() {

    }



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {return height;}

    public void setWeight(int newWeight) {
        if(weight > 0){
            weight = newWeight;
        }else{
            System.out.println("weight must be bigger than 0");
        }
    }
    public double getWeight() {return weight;}

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    public String getFavFood(String favFood) {return favFood;}

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getSpeed() {
        return speed;
    }

    public String getSound() {
        return sound;
    }
    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }

}
