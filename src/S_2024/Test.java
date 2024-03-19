package S_2024;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {
    /*
    tách từ trong xâu kí tự
     */
    public static void main(String[] args) {
        String s="jg jhg jg       h";
        String[] a=s.split("\\s+");//tách kí tự theo dấu cách
        StringTokenizer st=new StringTokenizer(s);// mặc định tách theo dấu cách
        ArrayList<String> arr=new ArrayList<>();
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        s = s.replace('j', 'h');//thay thế kí tự
        System.out.println(s);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            arr.add(st.nextToken());
        }
    }
}
