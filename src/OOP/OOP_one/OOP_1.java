package OOP.OOP_one;

import java.util.Scanner;

class sv{
    private String name,date;
    private double gpa;

    public sv() {
    }

    public sv(String name, String date, double gpa) {
        this.name = name;
        this.date = date;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public Double getGpa(){
        return gpa;
    }
    public void setName(String name){
       this.name=name;
    }

    public void nhap(){
        Scanner sc= new Scanner(System.in);
        name=sc.nextLine(); date=sc.nextLine();
        gpa =sc.nextDouble();
    }
    public String chuanHoa(String d){
        String[] s= d.split("/");
        String res="";
        res+= String.format("%02d", Integer.parseInt(s[0]))+"/";
        res+=String.format("%02d",Integer.parseInt(s[1]))+"/"+String.format("%04d", Integer.parseInt(s[2]));
        return res;
    }
    public void disPlay(){
        System.out.print(name+" "+chuanHoa(date)+" ");
        System.out.printf("%.1f", gpa);
    }

    @Override
    public String toString() {
        return  name + " " + date + ' ' +  gpa ;
    }
}
public class OOP_1 {
    public static void main(String[] args) {
      sv x= new sv();
      x.nhap();
      x.setName("sdsdsd");
        System.out.println(x);
    }
}
