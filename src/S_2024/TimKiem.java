package S_2024;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiem {
    /*
    thuật toán ti kiếm
     */
    public static boolean binarySearch(int[] a,int x){
        int l=0,r=a.length-1;

        while (l<=r){
            int m=(l+r)/2;
            if (a[m]==x){
                return true;
            }else if (a[m]<x){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int x=sc.nextInt();
       int[] a={1,3,4,2,7};
        System.out.println(Linearsearch(a, x)?"true":"false");
        Arrays.sort(a,0,a.length);
        System.out.println(binarySearch(a,x)?"true":"false");
        System.out.println(Arrays.binarySearch(a,3));
    }
//On
    private static boolean Linearsearch(int[] a, int x) {
        int i;
        for(i=0; i< a.length;i++){
            if (x == a[i]) {
                return true;
            }
        }
        return false;
    }
}
