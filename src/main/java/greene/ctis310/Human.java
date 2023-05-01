package greene.ctis310;

public class Human extends Mammal implements Comparable<Mammal> {
    //instance variables
    private String name;
    private String size;
    private String diet;
    private String language;
    private int age;
    private String country;

    //constructor
    public Human(String name, String size, String diet, int age, boolean isAsleep, String language, String country) {
        super(name, size, diet, age, isAsleep);
        this.name = name;
        this.size = size;
        this.diet = diet;
        this.language = language;
        this.age = age;
        this.country = country;
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

    //implement abstract methods
    public void eat() {
        System.out.println("I eat all types of fruit, veggies, and meat.");
    }

    public void move() {
        if (isAsleep) {
            System.out.println("I can't move, I'm asleep.");
        } else {
            System.out.println("I move by walking on my two legs or by using a vehicle.");
        }
        
    }

    public void sleep() {
        if (isAsleep) {
            System.out.println("I'm already asleep.");
        } else {
            isAsleep = true;
            System.out.println("I'm going to sleep.");
        }
        System.out.println("I sleep at night in a bed.");
    }

    public void wakeUp() {
        if (isAsleep) {
            System.out.println("I'm already awake.");
        } else {
            isAsleep = false;
            System.out.println("Opening my eys and stretching my legs.");
        }
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //to string method with name, size, diet, age, language, and country and age first
    public String toString() {
        return "[Age: " + age + "] Name: " + name + " Size: " + size + " Diet: " + diet + " Language: " + language + " Country: " + country;
    }

}
