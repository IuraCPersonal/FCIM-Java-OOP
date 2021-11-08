package main.lab05;

public class J extends I{
    protected String j;
    private X x = new X("Ayana");

    public J(String a, X x) {
        super(a, x);
        this.j = a;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}
