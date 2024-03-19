package OOP.Exp;

import OOP.Paint.*;

import java.util.ArrayList;
import java.util.Collections;

public class TestShapeInterface {
    public static void main(String[] args) {

        Shape a= new Circle(3,1,1);
        Shape b= new Point2D(2,2);
        Shape c= new Triangle(new Point2D(0, 0), new Point2D(3, 0), new Point2D(0, 4));
        Shape d= new Rectangle(new Point2D(1,1),5,3);
        Shape e= new Line(new Point2D(1,5),new Point2D(4,1));
        ArrayList<Shape> arr=new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c); arr.add(d); arr.add(e);
        // "Trộn danh sách arr"
        Collections.shuffle(arr);
        System.out.println("In ra các hình trong array ngẫu nhiên:");
        for (Shape x : arr) {
            System.out.println(x.toString());
        }
         // chu vi dien tich cua cac hinh
        System.out.println("\nTổng chu vi dien tich cua cac hinh....:");
        double sum=0,sum2=0;
        for (Shape x:arr){
            sum+=x.chuVi();
            sum2+=x.area();
            System.out.println(x.toString());
        }
        System.out.println("tong chu vi : "+sum);
        System.out.println("tong dien tich : "+sum2);
        double max=0,min=arr.get(0).chuVi(), max1=0, min1=arr.get(0).area();
        for (Shape x:arr){
            if (max<x.chuVi()){
                max =x.chuVi();
            }
            if (max1<x.area()){
                max1=x.area();
            }
            if (min>x.chuVi()){
                min=x.chuVi();
            }
            if (min1>x.area()){
                min1=x.area();
            }
        }
        System.out.println("\nHình có chu vi và diện tích max:");
        for (Shape x:arr){
            if (max==x.chuVi()){
                System.out.println(x+" chu vi max");
            }
            if (max1==x.area()) System.out.println(x+" dien tich max");
            if (min==x.chuVi()) System.out.println(x+" chu vi min");
            if (min1==x.area()) System.out.println(x+" dien tich min");
        }
        System.out.println("\nCác hình sau khi phóng to : ");
        for (Shape x:arr){
            x.zoom(2);
            System.out.println(x.toString());
        }



    }
}
