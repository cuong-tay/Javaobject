package OOP.Paint;
//hình chữ nhật
public class Rectangle implements Shape {
    private Point2D A;
    private Point2D B;
    private Point2D C;
    private Point2D D;
    private Point2D center;


    private double ox, oy;

    public Rectangle(Point2D A, double ox, double oy) {
        this.A = A;
        this.ox = ox;
        this.oy = oy;
        this.B=new Point2D(A.getX()+ox,A.getY());
        this.C=new Point2D(A.getX()+ox,A.getY()+oy);
        this.D=new Point2D(A.getX(),A.getY()+oy);
        center=new Point2D((A.getX()+B.getX()+C.getX()+D.getX())/4,(A.getY()+B.getY()+C.getY()+D.getY())/4);
    }




    @Override
    public double area() {
        return ox*oy;
    }

    @Override
    public double chuVi() {
        return (ox+oy)*2;
    }

    @Override
    public double kc(Point2D p) {
        return center.kc(p);
    }

    @Override
    public void move(double dx, double dy) {
          A.move(dx,dy);
        this.B=new Point2D(A.getX()+ox,A.getY());
        this.C=new Point2D(A.getX()+ox,A.getY()+oy);
        this.D=new Point2D(A.getX(),A.getY()+oy);
        center=new Point2D((A.getX()+B.getX()+C.getX()+D.getX())/4,(A.getY()+B.getY()+C.getY()+D.getY())/4);
    }

    @Override
    public void rotate(double alpha) {
         A.setCenter(center);
         A.rotate(alpha);
        B.setCenter(center);
        C.setCenter(center);
        D.setCenter(center);
        B.rotate(alpha);
        C.rotate(alpha);
        D.rotate(alpha);
    }

    @Override
    public void zoom(double soLan) {
         ox=ox*soLan;
         oy=oy*soLan;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "A=" + A.toString() +
                ", B=" + B.toString() +
                ", C=" + C.toString() +
                ", D=" + D.toString() +
                '}';
    }

}
