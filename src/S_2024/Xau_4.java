package S_2024;

public class Xau_4 {
    /*
    Chuẩn hóa tên , ngày sinh :
    phải viết hoa chữ cái đầu tiên,
    ngày sinh phải dưới dạng dd/mm/yyyy;

     */
    public static void main(String[] args) {
         String name="vu     manh cuong";
         String date="2/1/2001";
         String[] s= name.split("\\s+");
         String res="";
         //chuẩn hóa tên
        extracted(s, res);
        //chuẩn hóa ngày sinh
        String[] s1=date.split("/");
        String ans="";
            ans+= String.format("%02d",Integer.parseInt(s1[0]))+"/";
            ans+=String.format("%02d",Integer.parseInt(s1[1]))+"/"+s1[2];
        System.out.println(ans);

    }

    public static void extracted(String[] s, String res) {
        for (String x: s){
            res +=Character.toUpperCase(x.charAt(0));
            for (int j=1;j<x.length();j++){
                res +=Character.toLowerCase(x.charAt(j));
            }
            res +=" ";
        }
        res=res.trim();//.trim là xóa dấu cách thừa ở đầu và ở cuối chuỗi
        System.out.println(res);
    }
}
