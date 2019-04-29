class Override {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ab = new B();
        A ac = new C();
        a.meow();
        b.meow();
        c.meow();
        ab.meow();
        ac.meow();
    }

    void meow() {
        System.out.println(1);
    }
}

class A {
    void meow() {
        System.out.println(42);
    }
}

class B extends A {
    void meow() {
        System.out.println(23333);
    }
}

class C extends A {
    
}