package main.lab05;

public class A {
    protected String a;
    protected X x = new X("Skittle");

    public A(String a, X x) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" + "a='" + a + '\'' + ", x=" + x.toString() + "}\n";
    }
}
