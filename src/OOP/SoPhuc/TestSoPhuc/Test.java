package OOP.SoPhuc.TestSoPhuc;

import OOP.SoPhuc.ArrSoPhuc;
import OOP.SoPhuc.SoPhuc;

public class Test {
    public static void main(String[] args) {
        ArrSoPhuc arr= new ArrSoPhuc();
        SoPhuc a1= new SoPhuc(1,1);
        SoPhuc a2= new SoPhuc(2,5);
        SoPhuc a3= new SoPhuc(2,0);
        arr.add(a3);
        arr.add(a1);
        arr.add(a2);
        System.out.println("Trung bình cộng các số phức trong dãy: "+arr.tbc().toString());
        System.out.println("Số phức có mô đun lớn nhất: "+arr.maxSoPhuc().toString());
        System.out.println("số lượng số phức ko có phần ảo là: "+arr.demSoPhuc());
    }
}
