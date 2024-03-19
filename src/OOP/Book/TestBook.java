package OOP.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList<Books> arr = new ArrayList<>();
      for (int i=0;i<n;i++){
          String ten =sc.nextLine();
          double gia = sc.nextDouble();
          int soLuong = sc.nextInt();
          sc.nextLine();
          Author x=new Author(sc.nextLine(),sc.nextLine(),sc.nextLine().charAt(0));
          Books b = new Books(ten,x,gia,soLuong);
          arr.add(b);
      }
        Collections.sort(arr, new Comparator<Books>() {
            @Override
            public int compare(Books o1, Books o2) {
                if (o1.getPrice()!= o2.getPrice()){
                    if (o1.getPrice()> o2.getPrice()){
                        return -1;
                    }
                    return 1;
                } else return o1.getName().compareTo(o2.getName());
            }
        });
      for (Books x:arr){
          System.out.println(x);
      }
    }
}
