package OOP.PhanSo;

public class Phanso {
    private int t,m;
    public Phanso(int t, int m) {
        this.t = t;
        this.m = m;
    }

    public Phanso() {
        t=0;
        m=1;
    }

    public int getT() {
        return t;
    }

    public int getM() {
        return m;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return t+"/"+m;
    }
    // tổng hai phân số
    public Phanso sum(Phanso a){
        if (this.m==a.m){
            int newNumerator = a.t  + this.t;
            int newDenominator = this.m ;
            Phanso result = new Phanso(newNumerator, newDenominator);

            return result;
        }
            int newNumerator = a.t * this.m + this.t * a.m;
            int newDenominator = this.m * a.m;
            Phanso result = new Phanso(newNumerator, newDenominator);
            result.RG();
        return result;
    }
    public Phanso sub(Phanso a){
        if (this.m==a.m){
            int newNumerator = a.t  - this.t;
            int newDenominator = this.m ;
            Phanso result = new Phanso(newNumerator, newDenominator);

            return result;
        }
        int newNumerator = a.t * this.m - this.t * a.m;
        int newDenominator = this.m * a.m;
        Phanso result = new Phanso(newNumerator, newDenominator);
        return result;
    }
    // nhân hai phân số
    public Phanso multi(Phanso a){
        int newNumerator = a.t*this.t;
        int newDenominator = this.m * a.m;
        Phanso result = new Phanso(newNumerator, newDenominator);
        // rút gọn kết quả
        result.RG();
        return result;
    }
    // chia hai phân số
 public Phanso divPS(Phanso a){
        if (this.m==0 || a.m==0){
            return null;
        }
        int tu=this.t*a.m;
        int mau=this.m*a.t;
     if (mau == 0) {
         return null;}
        Phanso r=new Phanso(tu,mau);
        r.RG();
        return r;
 }
    //rút gọn hai phân số
    public void RG(){
        int ucln=Phanso.UCLN(this.t,this.m);
        this.t/=ucln;
        this.m/=ucln;
    }
    public static int UCLN(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // so sánh hai phân số
    public int ss(Phanso a) {
        // Nhân chéo để tránh vấn đề với số thực
        long tuSo1 = this.t * a.m;
        long tuSo2 = a.t * this.m;

        // So sánh tử số trực tiếp
        if (tuSo1 > tuSo2) {
            return 1;
        } else if (tuSo1 == tuSo2) {
            return 0;
        } else {
            return -1;
        }
    }

    public int tuSo(){
        return t/m;
    }
    public double phanKoNguyen(){
        return 0;
    }


}
