package S_2024;

public class Xau_3 {
    public static boolean soDep(String s){
        for (int i=0;i<s.length()-1;i++){
            if (Math.abs(s.charAt(i)-s.charAt(i+1))!=1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
             String s="1234567";
               // if (soDep(s)){
              //   System.out.println("yes");
             //} else System.out.println("no");
        StringBuilder sb= new StringBuilder("");
        int dem=0;
        for (int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            ++dem;
            if (dem%3==0 && i!=0){
                sb.append(",");
            }
        }
        System.out.println(sb.reverse());
    }
}
