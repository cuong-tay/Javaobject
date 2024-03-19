package baiTapJava;

import java.util.Scanner;

public class ptb2 {
    public static double dt(double a, double b, double c){
        return b*b-4*a*c;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("pt có vô số nghiệm");
                }else System.out.println("pt vô nghiệm");
            }else {
                System.out.println("nghiệm của pt là:"+(-c/b));
            }
        }else {
            if (dt(a,b,c)>0){
                double x1=-b+Math.sqrt(dt(a,b,c))/(2*a);
                double x2=-b-Math.sqrt(dt(a,b,c))/(2*a);
                System.out.println(x1+" "+x2);
            }else if (dt(a,b,c)<0){
                System.out.println("pt vô nghiệm");
            }else System.out.println("pt có 1 nghiệm duy nhất là :"+-b/(2*a));
        }
    }
}
