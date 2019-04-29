class FieldShadow {
    int a;
    public static void main(String[] args) {
        A a = new A();
        a.fun();
    }
}

class A extends FieldShadow {
    boolean a;

    void fun() {
        System.out.println(cast(a));
        System.out.println(super.a);
    }

    static int cast(boolean t) {
        if (t) return 1;
        return 0;
    }
}