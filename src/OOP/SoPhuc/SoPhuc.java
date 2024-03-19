package OOP.SoPhuc;

import OOP.PhanSo.Phanso;

public class SoPhuc {
    //attributes
    private double thuc,ao;

    public SoPhuc() {
        thuc=1.0;
        ao=-1.0;
    }

    public SoPhuc(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public double getThuc() {
        return thuc;
    }

    public double getAo() {
        return ao;
    }

    public void setThuc(double thuc) {
        this.thuc = thuc;
    }

    public void setAo(double ao) {
        this.ao = ao;
    }
    //Tổng hai số phức
    public SoPhuc sum(SoPhuc x){
        double t=thuc+x.thuc;
        double a=ao+x.ao;
        SoPhuc k= new SoPhuc(t,a);
        return k;
    }
    //moddun hai số phức
    public double modun(){
        return Math.sqrt(thuc*thuc+ao*ao);
    }

    @Override
    public String toString() {
        return thuc+"+"+ao+"i";
    }
}
