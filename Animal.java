public interface Animal {
    public String getSound();

    default public boolean CanSwim() {
        return true;   
    }
}
