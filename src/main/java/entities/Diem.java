package entities;

public class Diem {
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //contrator
    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // generation
    public static Diem generate() {
        final int max = 10;
        final int min = -10;
        int x = (int) Math.floor(Math.random() * (max - min)) + min;
        int y = (int) Math.floor(Math.random() * (max - min)) + min;
        Diem p = new Diem();
        p.x = x;
        p.y = y;
        return p;
    }

    // distance
    public double distance(Diem p2) {
        double dx = p2.x - this.x;
        double dy = p2.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // findSymmetry
    public Diem findSymmetry() {
        Diem dx = new Diem();
        dx.x = -this.x;
        dx.y = -this.y;
        return dx;

    }

    // findXAxisSymmetry
    public Diem findXAxisSymmetry() {
        Diem dx = new Diem();
        dx.x = -this.x;
        dx.y = this.y;
        return dx;
    }

    // findYAxisSymmetry
    public Diem findYAxisSymmetry() {
        Diem dx = new Diem();
        dx.x = this.x;
        dx.y = -this.y;
        return dx;
    }

    //
    public int detectQuadrant() {
        if (this.x > 0 && this.y > 0)
            return 1;//goc phan tu thu 1
        if (this.x > 0 && this.y < 0)
            return 2;//goc phan tu thu 2
        if (this.x < 0 && this.y < 0)
            return 3;//goc phan tu thu 3
        return 4;//goc phan tu thu 4
    }


    public static Diem parseFromString(String str) {
        String[] parts = str.split(",");
        Diem p = new Diem();
        p.x = Integer.parseInt(parts[0]);
        p.y = Integer.parseInt(parts[1]);
        return p;
    }

    @Override
    public String toString() {
        return "Diem{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
