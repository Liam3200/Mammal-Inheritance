package greene.ctis310;

public class Bear extends Mammal implements Comparable<Mammal>{
    //instance variables
    private String color;
    private String species;
    private boolean hibernate;

    //constructor
    public Bear(String name, String size, String diet, int age, boolean isAsleep, String color, String species, boolean hibernate) {
        super(name, size, diet, age, isAsleep);
        this.color = color;
        this.species = species;
        this.age = age;
        this.hibernate = hibernate;
    }

    //implement abstract methods
    public void eat() {
        System.out.println("I eat all types of fruit, veggies, and meat.");
    }

    public void move() {
        if (isAsleep) {
            System.out.println("I can't move, I'm asleep.");
        } else {
            System.out.println("I move by walking on my four legs.");
        }
    }

    public void sleep() {
        if (hibernate) {
            System.out.println("I'm hibernating in the winter.");
        } else if (isAsleep) {
            System.out.println("I'm already asleep.");
        } else {
            isAsleep = true;
            System.out.println("I'm going to sleep.");
        }
        System.out.println("I sleep at night in a cave.");
    }

    public void wakeUp() {
        if (hibernate) {
            System.out.println("I'm hibernating in the winter.");
        } else if (isAsleep) {
            isAsleep = false;
            System.out.println("Opening my eys and stretching my legs.");
        } else {
            System.out.println("I'm already awake.");
        }
    }

    //method to hibernate
    public void hibernate() {
        hibernate = true;
        System.out.println("I'm hibernating in the winter.");
    }

    //implement comparable interface
    public int compareTo(Mammal m) {
        //if this object is greater than the object passed in, return 1
        if (this.age > m.age) {
            return 1;
        }
        //if this object is less than the object passed in, return -1
        if (this.age < m.age) {
            return -1;
        }
        //if this object is equal to the object passed in, return 0
        return 0;
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isHibernate() {
        return hibernate;
    }

    public void setHibernate(boolean hibernate) {
        this.hibernate = hibernate;
    }

    //toString method that displays all variables with age first
    public String toString() {
        return "[Age: " + age + "] Name: " + name + " Size: " + size + " Diet: " + diet + " Color: " + color + " Species: " + species + " Hibernating: " + hibernate;
    }
    
}
