/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Human myHuman = new Human();
        System.out.println("The man says " + myHuman.getSound());
        Dog myDog = new Dog();
        System.out.println("The dog says " + myDog.getSound());
        Cat myCat = new Cat();
        System.out.println("The cat says " +myCat.getSound());

    }
}