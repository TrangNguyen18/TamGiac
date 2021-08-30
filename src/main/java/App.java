import entities.Diem;
import entities.TamGiac;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {
        Diem p1 = Diem.parseFromString("2,3");
        System.out.println(p1);
        Diem p2 = new Diem(3, 4);
        System.out.println(p2);
        Diem p3 = Diem.generate();
        System.out.println(p3);
        //tim khoang cach tu diem 1 den diem 2
        System.out.format("Khoang cach tu %s den %s la %f\n", p1, p2, p1.distance(p2));
        // tim diem doi xung qua tam
        System.out.format("Diem doi xung qua tam cua %s la %s\n", p1, p1.findSymmetry());
        //tim diem doi xung qua truc hoanh
        System.out.format("Diem doi xung qua truc hoanh cua %s la %s\n", p1, p1.findXAxisSymmetry());
        // tim diem doi xung qua truc tung
        System.out.format("Diem doi xung qua truc tung cua %s la %s\n ", p1, p1.findYAxisSymmetry());
        // tim goc phan tu cua diem
        System.out.format("%s thuoc goc phan tu so %d\n", p3, p3.detectQuadrant());

        System.out.println("--------------------------");
        TamGiac tg1 = new TamGiac();
        System.out.println(tg1);
        System.out.format("P = %f\n",tg1.calculatePerimeter());
        System.out.format("S = %f\n",tg1.calculateArea());
    }
}
