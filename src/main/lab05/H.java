package main.lab05;

public class H extends G{
    protected String h;

    public H(String a, X x) {
        super(a, x);
        this.h = a;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}