public class Human extends Object{
    
    String sound = "GET OFF MY LAWN!";
    String name;

    
    public String getSound() {
        return sound;

    }

    // constructor for name
    public Human(String name) {
        super();
        this.name = name;
    }

    // overide toString method
    @Override
    public String toString(){
        return name;
    }
}
