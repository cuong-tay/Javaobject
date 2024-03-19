package baiTapJava;

public class String_4 {
    public static void main(String[] args) {
        String s = "abc 1f23     113 ddae";
        String[] arr = s.split("\\s+");
        int value;
        int t=0;
        for (String a: arr){
            try{
                value = Integer.parseInt(a);
                t+=value;
            }
            catch (NumberFormatException e){

            }
        }
        System.out.println(t);

    }
}
