package baiTapJava;

public class tinhBieuThuc {
    /*
    Tính biểu thức S=1+n*x/1!+n*(n-1)*x^2+...+n!*x^n/n!
     */
    public static double S(int n, double x){
        double sum = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= (n - i + 1) * x / i;
            sum += term;
        }

        return sum;
    }
    public static void main(String[] args) {
        int n=2;
        double x=10;
        double kq=S(n,x);
        System.out.println("Giá trị của S :"+kq);
    }
}
