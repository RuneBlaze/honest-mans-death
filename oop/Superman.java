class Superman {
    public static void main(String[] args) {
        A b = new B();
        b.bark();
    }
}

class A {
    int x;
    void bark() {

    }
}

class B extends A {
    int x;

    void bark() {
        this.x = 100;
        System.out.println(x);
        System.out.println(super.x);
    }
}