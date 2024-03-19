package S_2024;
/*
Hàm compareTo() so sánh 2 xâu theo thứ tự từ điển, nếu 2 xâu bằng nhau trả về 0,
trả về số âm nếu xâu hiện tại nhỏ hơn xâu cần so sánh, ngược lại trả về số dương.
Hàm compareTo() và compareToIgnoreCase():
Hàm compareToIgnoreCase() sẽ bỏ qua in hoa in thường khi so sánh.
 */
public class Xau {
    public static void main(String[] args) {
        String s="java cr7 siuuuu";
        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        s=s.toLowerCase();
        System.out.println("\n"+s);
        s=s.toUpperCase();
        System.out.println(s);
        if (s.compareTo("jhd")==0){
            System.out.println("giống nhau");
        }else System.out.println("ko giống");
        if (s.equals("jahgfhg")){
            //trả về true nếu hai xâu giống nhau
            System.out.println("giống");
        }else System.out.println("ko");
    }
}
