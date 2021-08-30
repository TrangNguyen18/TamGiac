package entities;

import java.util.PrimitiveIterator;

public class TamGiac {
    private Diem d1;
    private Diem d2;
    private Diem d3;

    public TamGiac() {
        this.d1 = Diem.generate();
        this.d2 = Diem.generate();
        this.d3 = Diem.generate();
    }

    public TamGiac(Diem d1, Diem d2, Diem d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TamGiac{\n");
        sb.append("\td1= ").append("(").append(d1.getX()).append(",").append(d1.getY()).append(")").append("\n");
        sb.append("\td2= ").append("(").append(d2.getX()).append(",").append(d2.getY()).append(")").append("\n");
        sb.append("\td3= ").append("(").append(d3.getX()).append(",").append(d3.getY()).append(")").append("\n");

//        sb.append("\td2= ").append(d2).append("\n");
//        sb.append("\td3= ").append(d3).append("\n");
        sb.append('}');
        return sb.toString();
    }

    public double calculatePerimeter() {
        double a = this.d1.distance(this.d2);
        double b = this.d2.distance(this.d3);
        double c = this.d3.distance(this.d1);
        return a + b + c;
    }

    public double calculateArea() {
        double a = this.d1.distance(this.d2);
        double b = this.d2.distance(this.d3);
        double c = this.d3.distance(this.d1);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
