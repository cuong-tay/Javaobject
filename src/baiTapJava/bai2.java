package baiTapJava;

import java.util.Scanner;

public class bai2 {

        //doixung
        public static boolean doiXung(int[] a,int n){
            int l=0,r=n-1;
            while (l<=r){
                if (a[l]!=a[r]){
                    return false;
                }
                ++l;--r;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if (doiXung(a,n)){
            System.out.println("yes");
        }else System.out.println("no");
        for (int s:a){
            System.out.print(s+" ");
        }
    }

}
