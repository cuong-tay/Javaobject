package S_2024;

public class string {
    public static void main(String[] args) {
        String s="2/2/2001";
        String[] s1= s.split("/");
        //for (String x:s1){
          //  System.out.println(x);
        //}
        String ans= String.format("%02d", Integer.parseInt(s1[0]))+"/";
        //.format giúp lấp đầy số đằng trước số đã cho :
        //ví dụ: %03d : số có ba chữ số ko có nó tự thêm số 0 vào đằng trước số đó
        ans+=String.format("%02d",Integer.parseInt(s1[1]))+"/"+s1[2];
        System.out.println(ans);
    }
}
