class Cyclic {
    public static void main(String[] args) {
        System.out.println(A.a);
        System.out.println(B.a);
    }
}

class A {
    static int a = B.a - 3;
}

class B {
    static int a = A.a * 2;
}

