public class B extends A {
    private String var3;
    private String var4;

    @Override
    public String Present() {
        // TODO Auto-generated method stub
        return super.Present() + var3 + var4;
    }

    public B(String var1, String var2, String var3, String var4) {
        super(var1, var2);
        this.var3 = var3;
        this.var4 = var4;
    }
}
