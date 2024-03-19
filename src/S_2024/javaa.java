package S_2024;

import java.util.Scanner;

public class javaa {
    public static boolean nguyenTo(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean thuanNghich(int n){
        int tmp = n,rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return tmp ==rev;
    }
    public static boolean cp(int n){
        int can=(int)Math.sqrt(n);
        if(can*can==n) return true;
        else return false;
    }
    public static boolean check(int n){
        int tong=0;
        while(n!=0){
            tong+=n%10;
            n/=10;
        }
        return nguyenTo(tong);
    }

    public static void main(string[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        int dem1=0,dem2=0,dem3=0,dem4=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if (nguyenTo(a[i])){
                dem1++;
            }
            if (thuanNghich(a[i])) dem2++;
            if (cp(a[i])) dem3++;
            if (check(a[i])) dem4++;
        }
        System.out.println(dem1+" "+dem2+" "+dem3+" "+dem4);

    }
}
