class Crossbell {
    public static void main(String[] args) {
        A a = new B();
        a.bark();
        a.meow();
    }
}

class A {
    void bark() {
        System.out.println(666);
    }
    
    void meow() {
        System.out.println(42);
    }
}

class B extends A {
    void bark() {
        super.meow();
        System.out.println(-666);
    }
    
    void meow() {
        super.bark();
        System.out.println(-42);
    }
}