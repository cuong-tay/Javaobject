package OOP.PhanSo.TestPhanSo;

import OOP.PhanSo.ArrPhanSo;
import OOP.PhanSo.Phanso;

public class Test {
    public static void main(String[] args) {
        Phanso a= new Phanso(19,1);
        Phanso b= new Phanso(5,8);
        Phanso c= new Phanso(1,4);
        Phanso sum = a.sum(b);
        Phanso sub = a.sub(b);
        Phanso multi=a.multi(b);
        System.out.println(sum.toString());
        System.out.println(multi.toString());
        //cau 2
        System.out.println(sum.toString());
        int ok=a.ss(b);
        if (ok==0){
            System.out.println(a+"="+b);
        } else if (ok==1){
            System.out.println(a+">"+b);
        } else System.out.println(a+"<"+b);
        // bài 2:
        ArrPhanSo arr = new ArrPhanSo();
        arr.addPhanso(a);
        arr.addPhanso(b);
        arr.addPhanso(c);
        System.out.println(arr.maxPhanSo().toString());
        System.out.println("Tổng các phân số trong mảng:"+arr.sumArr().toString());

        System.out.println("Số phân số ko phải số nguyên: "+arr.xacDinh());
    }
}
