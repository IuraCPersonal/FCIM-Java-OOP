package main.lab05;

public class D extends C{
    protected String d;
    protected X x = new X("Lester");

    public D(String a, X x) {
        super(a, x);
        this.d = a;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}