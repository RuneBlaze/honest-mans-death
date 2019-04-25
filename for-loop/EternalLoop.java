class EternalLoop {
    public static void main(String[] args) {
        int x = 0;
        for (; x <= 99 ; ) {
            x = x + 1;
        }
        System.out.println(x);
    }
}