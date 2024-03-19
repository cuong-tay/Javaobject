package OOP.Exp;

import OOP.Paint.Point2D;
import OOP.Paint.Point3D;

import java.util.ArrayList;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 9);
        Point2D p2 = new Point2D(3, 7);
        Point3D p4 = new Point3D(1, 2, 3);
        Point3D p5 = new Point3D(8, 5, 0);
        Point2D p3= new Point2D(2,3);
        Point2D[] lPoints = {p1, p2,p3,p4,p5};
       Point3D[] arr={p4,p5};
        double sum1 = 0,sum2=0;
        ArrayList<Point2D> arrDX= new ArrayList<>();

        // Tính tổng khoảng cách giữa các điểm trong mảng Point2D
        for (int i = 0; i < lPoints.length-1 ; i++) {
            for (int j=i+1;j<lPoints.length;j++){
                sum1 += lPoints[i].distance(lPoints[i+1]);
            }
        }
        System.out.println("Tổng khoảng cách của các điểm trong mảng Points2D: " + sum1);
        //Tính tổng khoảng cách giữa các điểm trong mảng Point3D
        for (int i=0;i< arr.length-1;i++){
             for (int j=i+1;j<arr.length;j++){
                 sum2+=arr[i].distance(arr[i+1]);
             }
        }
        System.out.println("Tổng khoảng cách của các điểm trong mảng Points3D: " + sum2);
        for (int i=0;i< arr.length;i++){
            arrDX.add(arr[i].diemDX());
        }
        for (int i=0;i<lPoints.length;i++){
            arrDX.add(lPoints[i].diemDX());
            System.out.println(lPoints[i]);
        }
        System.out.println("danh sách điểm đối xứng qua gốc tọa độ cả 2D và 3D: ");
        for (Point2D x:arrDX){
            System.out.println(x);
        }




}}
