class SimpleStruct {
    public SimpleStruct(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    void fun() {
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
    int i;
    int j;
    int k;

    public static void main(String[] args) {
        SimpleStruct ss = new SimpleStruct(99, 0, -42);
        ss.fun();
    }
}