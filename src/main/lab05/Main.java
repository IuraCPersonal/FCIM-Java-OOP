package main.lab05;

public class Main {

    public static class A {
        public String a = "a";

        @Override
        public String toString() {
            return this.a;
        }
    }

    public static class B extends A {
        public String b;
    }

    public static class C extends B {
        public String c;
    }

    public static class D extends C {
        public String d;
    }

    public static class E extends D {
        public String e;
    }

    public static class F extends E {
        public String f;
    }

    public static class G extends F {
        public String g;
    }

    public static class H extends G {
        public String h;
    }

    public static class I extends H {
        public String i;
    }

    public static class J extends I {
        public String j;
    }

    public static void main(String []args) throws Exception {

        A a = new A();
    }

}
