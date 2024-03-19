package OOP.PhanSo;

import java.util.ArrayList;

public class ArrPhanSo {
    private  ArrayList<Phanso> arr = new ArrayList<>();
    public void addPhanso(Phanso phanso) {
        arr.add(phanso);
    }
    public Phanso maxPhanSo() {
        if (arr.isEmpty()) {
            // Trường hợp danh sách rỗng, trả về null hoặc thực hiện xử lý phù hợp
            return null;
        }
        Phanso max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (max.ss(arr.get(i)) == -1) {
                max = arr.get(i);
            }
        }

        return max;
    }
    public Phanso sumArr(){
        Phanso tong= new Phanso();
        for (int i = 0; i < arr.size(); i++){
            tong=tong.sum(arr.get(i));
        }
        return tong;
    }
    public int xacDinh(){
        int dem=0;
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i).getM()!=1){
                dem++;
            }
        }
        return dem;
    }

    @Override
    public String toString() {
        return "ArrPhanSo{" +
                "arr=" + arr +
                '}';
    }
}
