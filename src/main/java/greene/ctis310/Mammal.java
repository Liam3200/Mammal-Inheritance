package greene.ctis310;

public abstract class Mammal {
    // Instance variables
    protected String name;
    protected String size;
    protected String diet;
    protected int age;
    protected boolean isAsleep;

    // Constructor
    public Mammal(String name, String size, String diet, int age, boolean isAsleep) {
        this.name = name;
        this.size = size;
        this.diet = diet;
        this.age = age;
        this.isAsleep = isAsleep;
    }

    abstract void eat();
    abstract void move();
    abstract void sleep();
    abstract void wakeUp();

    public int compareTo(Mammal mammal) {
        return 0;
    }

}
