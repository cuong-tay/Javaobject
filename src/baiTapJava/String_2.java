package baiTapJava;

import java.util.StringTokenizer;

public class String_2 {
    /*
    nhập chuỗi string là các số cách nhau bởi dấu cách
    ktra xem có thỏa mãn là các số ko, nếu đúng thì có bao nhiêu số?
     */
    public static boolean ktra(String s){
        for (char c:s.toCharArray()){
            //ktra xem chuỗi có phải toàn số và cách nhau bởi dấu cách ko?
            if (!Character.isDigit(c) && c!=' ' && c!='.' && c!='-'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="2 34.5 -12.9 0 12 1.98";
        String s2="2 34.5 -12a.9 0 12 1b.98";
        String[] a=s1.split("\\s+");
        String[] b=s2.split("\\s+");
        if (ktra(s1)){
            System.out.println("true "+a.length);
        }else {
            System.out.println("false");
        }
        if (ktra(s2)){
            System.out.println("true "+b.length);
        }else System.out.println("flase");


    }
}
