class Subtype {
    public static void main(String[] args) {
        A a = new B();
        A b = fun(a);
    }

    static A fun(A a) {
        System.out.println(42);
        return new B();
    }
}

class A {

}

class B extends A {
    
}