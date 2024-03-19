package baiTapJava;


import java.math.BigInteger;

public class Solon {
    public static void main(String[] args) {
        //xử lý số nguyên lớn
        BigInteger a= new BigInteger("2342342342323333");
        BigInteger b= new BigInteger("222222222");
        System.out.println(a.add(b));// cong hai số nguyên
        System.out.println(a.gcd(b));// ước chung lớn nhất hai số
        System.out.println(a.subtract(b));//trừ hai số
        System.out.println(a.multiply(b));// nhân hai số lớn
        System.out.println(a.divide(b));//a / b


    }


}
