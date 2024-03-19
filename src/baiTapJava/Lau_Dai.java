package baiTapJava;

public class Lau_Dai {
    public static boolean ktraDinh(int[] arr, int p){
        return arr[p]>arr[p-1] && arr[p]>arr[p+1];
    }
    public static boolean ktraduoi(int[] s, int p){
        return s[p]<s[p+1] && s[p] <s[p-1];
    }
    public static void main(String[] args) {
        int[] a={1,1,3,5,2,7,0,8,8,5};
        int d=0;
         for (int i=1;i<a.length-1;i++){
             if (ktraDinh(a,i)){
                 d++;
             }else if (ktraduoi(a,i)){
                 d++;
             } else if (a[a.length-1]!=a[i]){
                 d++;
             }
         }
        System.out.println(d);
    }
}
