package OOP.OOP_one;

import java.util.*;


class sv1{
    private String id, name,date;
    private double gpa;

    public sv1(int id, String name, String date, double gpa) {
        this.id = "SV"+String.format("%03d",id);
        this.name = name;
        this.date = date;
        this.gpa = gpa;
    }
    public void chuanHoa(){
        String[] s= this.date.split("/");
        String res="";
        res+= String.format("%02d", Integer.parseInt(s[0]))+"/";
        res+=String.format("%02d",Integer.parseInt(s[1]))+"/"+String.format("%04d", Integer.parseInt(s[2]));
        this.date=res;
        String[] s2= this.name.split("\\s+");
        String r="";
        for (String x:s2){
            r+=Character.toUpperCase(x.charAt(0));
            for (int j=1;j<x.length();j++){
                r+=Character.toLowerCase(x.charAt(j));
            }
            r+=" ";
        }
        r=r.trim();
        this.name=r;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void disPlay(){
        System.out.println(id+" "+name+" "+date+" "+gpa);
    }

    public String toString() {
        return id+" "+name+" "+date+" "+String.format("%.2f", gpa);
    }
}
public class OOP_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
          int n=2;

        ArrayList<sv1> a= new ArrayList<>();
        for (int i=1;i<=n;i++){
            sv1 x= new sv1(i,sc.nextLine(),sc.nextLine(),sc.nextDouble());
            sc.nextLine();
            x.chuanHoa();
            a.add(x);
        }
       /* Collections.sort(a, new Comparator<sv1>() {
            //sắp xếp theo gpa tăng dần
            public int compare(sv1 o1, sv1 o2) {
                if (o1.getGpa()<o2.getGpa()){
                    return -1;
                } else
                    return 1;
            }
        });*/
        //sắp xếp mảng theo gpa tăng giần
       // a.sort(Comparator.comparingDouble(sv1::getGpa));
        //sắp xếp mảng theo gpa giảm dần thêm reversed vào là được
        a.sort(Comparator.comparingDouble(sv1::getGpa).reversed());
        for (sv1 ss:a){
            System.out.println(ss);
        }
       //tìm xem id có cái ý ko thì in ra
        for (sv1 x:a){
            if (x.getId().equals("SV001"))
            System.out.println(x);
        }

    }
}
