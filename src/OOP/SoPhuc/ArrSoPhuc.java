package OOP.SoPhuc;

import OOP.PhanSo.Phanso;

import java.util.ArrayList;

public class ArrSoPhuc {
    private ArrayList<SoPhuc> arr=new ArrayList<>();
    public void add(SoPhuc z){
        arr.add(z);
    }
    //Tbc hai số phức
    public SoPhuc tbc(){
        SoPhuc tong=new SoPhuc(0,0);
        for (int i=0;i<arr.size();i++){
            tong=tong.sum(arr.get(i));
        }
        double t=tong.getThuc()/arr.size();
        double a=tong.getAo()/arr.size();
        SoPhuc kq= new SoPhuc(t,a);
        return kq;
    }
    //Xác định s phức có mô đun max
    public SoPhuc maxSoPhuc() {
        if (arr.isEmpty()) {
            // Trường hợp danh sách rỗng, trả về null hoặc thực hiện xử lý phù hợp
            return null;
        }
        SoPhuc max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (max.modun()<arr.get(i).modun()) {
                max = arr.get(i);
            }
        }

        return max;
    }
 //xác định số phức ko có phần ảo
    public int demSoPhuc(){
        int d=0;
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getAo()==0){
                d++;
            }
        }
        return d;
    }
    @Override
    public String toString() {
        return "ArrSoPhuc{" +
                "arr=" + arr.toString() +
                '}';
    }
}
