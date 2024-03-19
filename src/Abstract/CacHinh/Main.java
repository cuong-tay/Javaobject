package Abstract.CacHinh;

import Abstract.Shape;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Shape> a=new ArrayList<>();
        Shape a1=new HinhTron("red",true,1);
       Shape a2=new Hcn("red",true,3,6);
       Shape a3=new Vuong("yeloow",false,5,5);// vì hình vuông dài rộng = nhau
       a.add(a1);
       a.add(a2);
       a.add(a3);
       for (Shape x:a){
           System.out.println(x);
           System.out.println(x.getArea());
           System.out.println(x.getPerimeter());
       }
    }
}
/*
package OOP.Paint;

public class Triangle implements Shape {
    private Point2D pointA;
    private Point2D pointB;
    private Point2D pointC;

    public Triangle(Point2D pointA, Point2D pointB, Point2D pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point2D getPointA() {
        return pointA;
    }

    public void setPointA(Point2D pointA) {
        this.pointA = pointA;
    }

    public Point2D getPointB() {
        return pointB;
    }

    public void setPointB(Point2D pointB) {
        this.pointB = pointB;
    }

    public Point2D getPointC() {
        return pointC;
    }

    public void setPointC(Point2D pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "DinhA=" + pointA +
                ", DinhB=" + pointB +
                ", DinhC=" + pointC +
                '}';
    }

    @Override
    public double area() {
       double a=pointA.distance(pointB);
       double b=pointA.distance(pointC);
       double c= pointB.distance(pointC);
        double ncv=(a+b+c)/2;
        return Math.sqrt(ncv*(ncv-a)*(ncv-b)*(ncv-c));

    }

    @Override
    public double chuVi() {
        // Implement the perimeter calculation using the points
        // (you need to implement the calculation based on points)
        return 0.0;
    }

    @Override
    public double kc() {
        // Implement the distance calculation between points
        // (you need to implement the calculation based on points)
        return 0.0;
    }

    @Override
    public void move(double dx, double dy) {
        // Implement the movement of the triangle by moving each point
        pointA.move(dx, dy);
        pointB.move(dx, dy);
        pointC.move(dx, dy);
    }

    @Override
    public void rotate(double alpha) {
        // Implement the rotation of the triangle around a certain point or the centroid
        // (you need to implement the rotation based on points)
    }

    @Override
    public void zoom(double soLan) {
        // Implement the zooming of the triangle based on points
        // (you need to implement the zooming based on points)
    }
}

 */