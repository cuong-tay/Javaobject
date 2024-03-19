package OOP.Paint;


public class Circle implements Shape  {
    //Attributes
    private double R,cx,cy;

    public Circle() {
    }

    public Circle(double r, double cx, double cy) {
        R = r;
        this.cx = cx;
        this.cy = cy;
    }

    public double getR() {
        return R;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public void setR(double r) {
        R = r;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                ", cx=" + cx +
                ", cy=" + cy +
                '}';
    }


    @Override
    public double area(){
        return R*R*Math.PI;
    }

    @Override
    public double chuVi() {
        return 2*Math.PI*R;
    }

    @Override
    public double kc(Point2D p) {
        return new Point2D(cx,cy).kc(p);
    }


    @Override
    public void move(double a, double b){
        this.cx+=a;
        this.cy+=b;
    }

    @Override
    public void rotate(double alpha) {
      return;}

    @Override
    public void zoom(double soLan) {
        R*=soLan;
    }
}
