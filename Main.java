import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Human myHuman = new Human("Dan");
        System.out.println("The man says " + myHuman.getSound());
        Dog myDog = new Dog();
        System.out.println("The dog says " + myDog.getSound());
        Cat myCat = new Cat();
        System.out.println("The cat says " + myCat.getSound());
        System.out.println(myCat); //prints out inherent toString 
        System.out.println(myHuman); //prints out overriden toString method
        Instructor myInstructor = new Instructor("Mellisa");
        System.out.println(myInstructor);

        var userList = new ArrayList<Human>();
        userList.add(myHuman);
        PrintUsers(userList);

        System.out.println(new Cat().CanSwim());
        System.out.println(new Dog().CanSwim());
        B b = new B("Apple", "Brocolli", "Carrot", "Diamond");
        System.out.println(b.Present());
    }

    public static void PrintUsers(ArrayList<Human> Human) {
        for(var human : Human) {
            System.out.println(human);
        }

    }
}