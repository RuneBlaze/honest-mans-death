class Vec3 {
    public Vec3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void show() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    int x; int y; int z;

    public static void main(String[] args) {
        // Vec3 o = new Vec2(10, 20);
        // o.show();
    }
}

class Vec2 extends Vec3 {

}