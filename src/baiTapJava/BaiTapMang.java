package baiTapJava;


import java.util.Arrays;

public class BaiTapMang {
    /*
    Các bài tập về Mảng
     */
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 5, 7, -33, 11, 22};
        int dem = 0, s = 0, d = 0, max = a[0];
        int l = 0;
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 != 0) {
                dem++;
            }
            if (a[i] >= -5 && a[i] <= 25) {
                s += a[i];
                d++;
            }
            if (a[i] > max && a[i] % 3 == 0) {
                max = a[i];
            }
            if (a[i] % 5 == 0 && a[i] % 3 != 0) {
                b[l] = a[i];
                l++;
            }
        }

        int[] luu = Arrays.copyOfRange(a, 0, a.length - l);
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (!contains(b, a[i], l)) {
                luu[index++] = a[i];
            }
        }

        sortabs(a);

        System.out.println("Số các phần tử không chia hết cho 3: " + dem);
        System.out.println("Trung bình cộng các phần tử từ -5 đến 25: " + (double) s / d);
        System.out.println(max == a[0] ? "Không có phần tử nào chia hết cho 3 trong mảng" : "Phần tử lớn nhất chia hết cho 3: " + max);
        System.out.println("mảng ban đầu sau khi sắp xếp: ");
        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println("\nMảng sau khi loại bỏ phần tử: ");
        for (int z:luu){
            System.out.print(z+" ");
        }
    }
//contains giúp ktra có phần tử tồn tại trong mảng  ko
    private static boolean contains(int[] array, int value, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    private static void sortabs(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (Math.abs(a[i]) > Math.abs(a[j])) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}


