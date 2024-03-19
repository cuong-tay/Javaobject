package S_2024;

import java.util.ArrayList;
import java.util.Scanner;
/*
Đề bài : nhập chuỗi kí tự thường tiếng anh
in ra chuỗi từ a->z mà không có kí tự trong chuỗi nhập
 */
public class Xau_1 {
    public static void xoaKiTu(StringBuilder str, StringBuilder s){
        for (int i=0;i<str.length();i++){
            char s1= str.charAt(i);
            if (s.indexOf(String.valueOf(s1))!=-1){
                str.deleteCharAt(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        ArrayList<String> a= new ArrayList<>();
        StringBuilder chuoi= new StringBuilder();
        for (char i='a';i<='z';i++){
            a.add(String.valueOf(i));
        }
        for (String str:a){
            chuoi.append(str);
        }
        xoaKiTu(chuoi,sb);
        System.out.println(chuoi);

    }
}
