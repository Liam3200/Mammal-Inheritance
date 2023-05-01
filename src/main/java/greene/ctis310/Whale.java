package greene.ctis310;

public class Whale extends Mammal implements Comparable<Mammal> {
    //instance variables
    private String ocean;
    private String species;

    //constructor
    public Whale(String name, String size, String diet, int age, boolean isAsleep, String ocean, String species) {
        super(name, size, diet, age, isAsleep);
        this.ocean = ocean;
        this.species = species;
        this.age = age;
    }

    //implement abstract methods
    public void eat() {
        System.out.println("I eat all types of fish and krill.");
    }

    public void move() {
        if (isAsleep) {
            System.out.println("I can't swim, I'm asleep.");
        } else {
            System.out.println("I'm swimming.");
        }
    }

    public void sleep() {
        if (isAsleep) {
            System.out.println("I'm already asleep.");
        } else {
            isAsleep = true;
            System.out.println("I'm going to sleep.");
        }
        System.out.println("I sleep by floating on the surface of the ocean.");
    }

    public void wakeUp() {
        if (isAsleep) {
            isAsleep = false;
            System.out.println("Opening my eys and stretching my fins.");
        } else {
            System.out.println("I'm already awake.");
        }
    }

    //method to surface for air
    public void surface() {
        System.out.println("I surface to breathe air.");
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
    public String getOcean() {
        return ocean;
    }

    public void setOcean(String ocean) {
        this.ocean = ocean;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //toString method displays all instance variables with age first
    public String toString() {
        return "[Age: " + age + "] Name: " + name + " Size: " + size + " Diet: " + diet + " Ocean: " + ocean + " Species: " + species;
    }


}
