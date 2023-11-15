public class Instructor extends Human {
    public Instructor(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Instructor Name: " + name;
    }
}
