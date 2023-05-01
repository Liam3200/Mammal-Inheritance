package greene.ctis310;

/**
 * Hello world!
 *
 */
public class MammalMain {
    public static void main(String[] args) {
        Mammal bear = new Bear("Liam", "Large", "Omnivore", 5, false, "Black", "Black", false);
        System.out.println(bear);
        bear.eat();
        bear.sleep();
        Mammal whale = new Whale("Willy", "Huge", "Carnivore", 20, true, "Pacific", "Orca");
        System.out.println(whale);
        whale.move();
        whale.wakeUp();
        Mammal human = new Human("John", "Medium", "Omnivore", 55, true, "English", "USA");
        System.out.println(human);
        human.wakeUp();

        // create an array of Mammal objects
        Mammal[] mammals = new Mammal[10];
        // add random mammals to the array with random ages, sizes, diets, and names
        for (int i = 0; i < mammals.length; i++) {
            int random = (int) (Math.random() * 3);
            if (random == 0) {
                mammals[i] = new Bear("Bear " + i, "Large", "Omnivore", (int) (Math.random() * 20), false, "Black",
                        "Black", false);
            } else if (random == 1) {
                mammals[i] = new Whale("Whale " + i, "Huge", "Carnivore", (int) (Math.random() * 100), true, "Pacific",
                        "Orca");
            } else {
                mammals[i] = new Human("Human " + i, "Medium", "Omnivore", (int) (Math.random() * 100), true, "English",
                        "USA");
            }
        }

        // print the array
        System.out.println("Unsorted array:");
        for (int i = 0; i < mammals.length; i++) {
            System.out.println(mammals[i]);
        }

        // sort the objects in the array using the compareTo method
        for (int i = 0; i < mammals.length; i++) {
            for (int j = 0; j < mammals.length - 1; j++) {
                if (mammals[j].compareTo(mammals[j + 1]) > 0) {
                    Mammal temp = mammals[j];
                    mammals[j] = mammals[j + 1];
                    mammals[j + 1] = temp;
                }
            }
        }

        // print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < mammals.length; i++) {
            System.out.println(mammals[i]);
        }

    }
}
