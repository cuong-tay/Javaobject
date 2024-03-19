package S_2024;

import java.util.LinkedHashSet;
import java.util.Set;


/*
 Set: như trong C++
 HashSet: thứ tự nó lưu các phần tử ngẫu nhiên
 linkedHashSet:thứ tự ptu trong mảng vẫn được dữ nguyên khi xuất ra màn hình
TreeSet giống trên nma các hàm tìm xóa nó sẽ mất LogN
khi nó lưu phần tử thì nó tự sắp xếp tăng dần
 */
public class Set_HashSet {
    public static void main(string[] args) {
       // HashSet<Integer> set=new HashSet<>();
        Set<Integer> set=new LinkedHashSet<>();
        int[] a={1,2,3,22,8,0,7};
        //set.add(100);
        //set.add(200);
        //set.add(100);
        for (int x:a){
            set.add(x);
        }
        //contains là tìm xem phần tử đc truyền vào có trong set ko
        if (set.contains(7)){
            System.out.println("found");
            set.remove(7);//xóa phần tử khỏi set
            //phải tra trc xem ptu ý có trong set thì mới xóa đc ko
            //ko thì bị lỗi
        }else System.out.println("Notfound");
        System.out.println(set.size());
    }
}
