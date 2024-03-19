package S_2024;

import java.util.Arrays;
import java.util.Comparator;


public class Sort {
    public static void main(string[] args) {
        int[] a={1,9,7,8,2,0,6,55,33};
        //sort mặc định tăng dần
        Arrays.sort(a,1,5);//1=>4
        //kiểu nguyên thủy chỉ sắp xếp tăng dần mặc định
        //muốn dùng comparater thì phải dùng kiểu dữ liệu Object
        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        Integer[] b = {1,9,7,8,2,0,6,-55,33};
        Arrays.sort(b, new Comparator<Integer>(){
            //trả về -1 hoặc 1(1 số âm hoặc 1 số dương)
            //nếu muốn o1 xuất hiện trc o2 trong thứ tự sắp xếp return -1
            //nếu muốn o1 xuất hiện sau o2 trong thứ tự sắp xếp return 1
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1)>Math.abs(o2)){//sắp xếp theo trị tuyệt đối giảm dần
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        for (int i:b){
            System.out.print(i+" ");
        }

    }
}
