public class A implements Presentable {
    
    private String var1;
    private String var2;

    @Override
    public String Present() {
        return var1 + var2;
    }

    public A(String var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
}
