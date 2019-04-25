class OverloadOne {
    public static void main(String[] args) {
        add(1, 2);
        add(true, false);
    }

    public static void add(int a, int b) {
        System.out.println(1);
    }

    public static void add(boolean a, boolean b) {
        System.out.println(2);
    }
}