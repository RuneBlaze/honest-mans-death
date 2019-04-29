class Interfere {
    static int a = 0;
    static int b = a;
    static int c = interfere(b);
    static int d = interfere(c);
    static int e = interfere(d);

    static int interfere(int d) {
        a = 99 + c + d;
        b = -a + d + 2;
        b = b * 2;
        c = -c + d + 2;
        c = -c * 2;
        System.out.println(42);
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}