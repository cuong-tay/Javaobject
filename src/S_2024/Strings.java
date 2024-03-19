package S_2024;

import java.util.Scanner;
/*
toUpperCase(): chuyển tất các kí tự thành in hoa
toLowerCase(): chuyển tất các kí tự thành in thường
 */
public class Strings {
    public static void main(String[] args) {
        //String s="";//xâu rỗng
        String s1="Vũ Mạnh Cường";
        Scanner sc=new Scanner(System.in);
        //int n= sc.nextInt();
       // sc.nextLine();//xử lí giống cin.ignore
        //String s=sc.nextLine();//trôi lệnh giống C,C++ nếu nhập số trước khi nhập xâu
       // System.out.println(s);
        System.out.println(s1);
      //  System.out.println(s.length());
        //lấy ra kí tự ở chỉ số bất kì
        System.out.println(s1.charAt(1));
        //duyệt từng kí tự
        for (char x:s1.toCharArray()){
            System.out.print(x);
        }
        System.out.println("");
        for (int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i));
        }
        System.out.println("");
        s1=s1.toUpperCase();//phải gán xâu s1 thì sâu s1 mới thay đổi
        System.out.println(s1);
        //nối hai xâu
        String s="java ssjsj",t="jhdsgaj jhasg";
        s=s.concat(" "+t+"cr7"+20000);//cũng là nối chuỗi
        //s=s+t+" siuuu "+100;//chuỗi t nối sau chuỗi s bằng phép s+t và gán lại vào s nên chỉ có xâu s là bị thay đổi còn xâu t vẫn nguyên
        System.out.println(s);
    }
}
