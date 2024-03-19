package baiTapJava;

public class Fibonaci {
    /*
    Tính giá trị fibonaci thứ n
    tìm phần tử trong dãy fibonaci gần n nhất
     */
    //tính số fibo thứu n
    public static long fiBo(long n){
        if (n <= 1) {
            return n;
        }

        long fibNMinus2 = 0;
        long fibNMinus1 = 1;
        long fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibNMinus1 + fibNMinus2;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fibN;
        }

        return fibN;
    }
    public static long timFiBo(long fiBo,long n){
        long a=0,b=1;
        while (true){
            long fitieptheo=a+b;
            if (Math.abs(fitieptheo-n)<Math.abs(fiBo-n)){
               fiBo=fitieptheo;
            }
            if (fitieptheo>n){
                break;
            }
            a=b;
            b=fitieptheo;
        }
        return fiBo;
    }
    public static void main(String[] args) {
        long a=1,b=2;
        long tong=0;
        for (long i=a;i<=b;i++){
            tong+=fiBo(i);
        }
        System.out.println(tong);
    }
}
