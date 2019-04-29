class InstOfE {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        p(a instanceof A);
        p(b instanceof B);
        p(a instanceof B);
        // p(b instanceof A);
    }

    static void p(boolean a) {
        if (a) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}

class A extends B {

}

class B {
    
}