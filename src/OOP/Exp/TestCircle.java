package OOP.Exp;

import OOP.Paint.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1= new Circle();
        Circle c2 = new Circle(3.0,2.0,1);
        System.out.println(c2.toString());
        System.out.println(c1.toString());
        System.out.println(c2.area());
        c2.move(3,4);
        c1.move(5,5);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
