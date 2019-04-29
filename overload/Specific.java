class Specific {
    public static void main(String[] args) {
        B b = new B();
        foo(b);
        fun(b);
    }

    static void foo(A a) {
        System.out.println(1);
    }

    static void fun(A a) {
        System.out.println("absurd!");
    }

    static void fun(B a) {
        System.out.println("Correct!");
    }
}

class A {

}

class B extends A{

}