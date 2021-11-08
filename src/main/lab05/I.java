package main.lab05;

public class I extends H{
    protected String i;

    public I(String a, X x) {
        super(a, x);
        this.i = a;
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", x=" + x.toString() +
                "}\n" + super.toString();
    }
}