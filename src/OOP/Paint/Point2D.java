package OOP.Paint;

public  class Point2D implements Shape {
    private double x,y;
    private Point2D center;
    public Point2D() {
        double x=0;
        double y=0;
        center= new Point2D(x,y);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Point2D[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double chuVi() {
        return 0;
    }

    @Override
    public double kc(Point2D p) {
        return Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y,2));
    }

    // tính khoàng cách giữa hai điểm

    public double distance(Point2D p) {
     double dx=this.x-p.x;
     double dy=this.y-p.y;
     return Math.sqrt(dx*dx+dy*dy);
 }

    @Override
    public void move(double dx, double dy) {
       x=x+dx;
       y=y+dy;
    }
    @Override
    public void rotate(double alpha) {
        double dx, dy;
        double centerX = center.getX();
        double centerY = center.getY();

        dx = (x - centerX) * Math.cos(Math.toRadians(alpha)) - (y - centerY) * Math.sin(Math.toRadians(alpha)) + centerX;
        dy = (x - centerX) * Math.sin(Math.toRadians(alpha)) + (y - centerY) * Math.cos(Math.toRadians(alpha)) + centerY;

        this.x = dx;
        this.y = dy;

    }

    @Override
    public void zoom(double soLan) {
     return;
    }

    //xác định điểm đối xứng
public Point2D diemDX(){
    double dx=x==0?0:-x;
    double dy=y==0?0:-y;
    Point2D k=new Point2D(dx,dy);
        return k;
}
// tịnh tiến đi một vị trí với độ lệch x,y
    public  Point2D tTien(Point2D p){
        double dx=x+p.x;
        double dy=y+p.y;
        Point2D k=new Point2D(dx,dy);
        return k;
    }


}
