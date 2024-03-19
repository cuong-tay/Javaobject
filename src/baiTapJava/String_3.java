package baiTapJava;

import com.sun.jdi.Value;

public class String_3 {
    public static void xoa(StringBuilder sb, char s){
        for (int i=0;i<sb.length();i++){
            if (sb.charAt(i) == s){
                sb.deleteCharAt(i);
                i--;
            }
        }
    }
    public static void main(String[] args) {
        String s="ab1c 1231 78 efg ";
        StringBuilder sb= new StringBuilder(s);
        xoa(sb,'a');
        xoa(sb,'b');
        xoa(sb,'c');
        xoa(sb,'e');
        xoa(sb,'f');
        xoa(sb,'g');
     String s1= sb.toString();
     String[] s2 =s1.split("\\s+");



    }
}
