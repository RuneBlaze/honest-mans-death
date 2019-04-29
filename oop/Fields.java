class Fields extends A {
    public static void main(String[] args) {
        Fields a = new Fields();
        a.i = 10;
        a.j = 42;
        System.out.println(a.j);
        System.out.println(a.i);
    }
}

class A {
    int i;
    int j;
}