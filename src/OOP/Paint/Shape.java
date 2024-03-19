package OOP.Paint;

public interface Shape {

    //nhóm tính toán
    public  double area();
    public abstract double chuVi();
    public double kc(Point2D p);

    //biến đổi
    public abstract void move(double dx, double dy);
    public abstract void rotate(double alpha);
    public void zoom(double soLan);



}
