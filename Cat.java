public class Cat implements Animal{
    
    String sound = "You worship me";

    public String getSound() {
        return sound;
    }

    @Override
    public boolean CanSwim() {
        return false;
    }
}
