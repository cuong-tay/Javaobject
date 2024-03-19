package baiTapJava;

public class String_1 {
    /*
    loại bỏ kí tự trong chuỗi và đảo ngược chuỗi
     */
    public  static void xoaKiTu(StringBuilder sb, char a){
        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i)==a){
                sb.deleteCharAt(i);
                i--;//để ktra xem nếu xâu có nhiều ch a thì nó xóa hết
                // vi du :"ggg hhhaaa f"
            }
        }
    }
    public static void main(String[] args) {
        String s="Lap trinh Java khong don gian";
       StringBuilder sb=new StringBuilder(s);
        xoaKiTu(sb,'a');
       sb.reverse();//lật ngược lại sâu
        System.out.println(sb);//toString trả về string


    }
}
