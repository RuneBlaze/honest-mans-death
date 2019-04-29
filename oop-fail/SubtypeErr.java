class SubtypeErr {
    public static void main(String[] args) {
        A a = new B();
        B b = new A();
    }
}

class A {

}

class B extends A {
    
}