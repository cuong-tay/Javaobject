package OOP.OOP_one;

import java.util.Scanner;

 class ThiSinh {

    private String name,date;
    private double diem1,diem2,diem3;
    ThiSinh(){}
     public void nhap(){
         Scanner sc= new Scanner(System.in);
         name=sc.nextLine();
         date=sc.nextLine();
         diem1=sc.nextDouble();
         diem2=sc.nextDouble();
         diem3= sc.nextDouble();
     }
    public void disPlay(){
        System.out.println(name+" "+date+" "+(diem1+diem2+diem3));
    }

}
public class SinhVien {
    public static void main(String[] args) {
        ThiSinh x= new ThiSinh();
        x.nhap();
        x.disPlay();

    }
}
