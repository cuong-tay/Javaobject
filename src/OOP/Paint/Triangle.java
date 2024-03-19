package OOP.Paint;

public class Triangle implements Shape {
    private Point2D pointA;
    private Point2D pointB;
    private Point2D pointC;
    private Point2D center;
    public Triangle(Point2D pointA, Point2D pointB, Point2D pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        center= new Point2D((pointA.getX()+pointB.getX()+pointC.getX())/3,(pointA.getY()+pointB.getY()+pointC.getY())/3);
    }

    public Point2D getPointA() {
        return pointA;
    }

    public void setPointA(Point2D pointA) {
        this.pointA = pointA;
    }

    public Point2D getPointB() {
        return pointB;
    }

    public void setPointB(Point2D pointB) {
        this.pointB = pointB;
    }

    public Point2D getPointC() {
        return pointC;
    }

    public void setPointC(Point2D pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "DinhA=" + pointA +
                ", DinhB=" + pointB +
                ", DinhC=" + pointC +
                '}';
    }



    @Override
    public double area() {
        double a=pointA.distance(pointB);
        double b=pointA.distance(pointC);
        double c= pointB.distance(pointC);
        double ncv=(a+b+c)/2;
        return Math.sqrt(ncv*(ncv-a)*(ncv-b)*(ncv-c));

    }

    @Override
    public double chuVi() {
        double a=pointA.distance(pointB);
        double b=pointA.distance(pointC);
        double c= pointB.distance(pointC);
        return a+b+c;
    }

    @Override
    public double kc(Point2D p) {

        return center.distance(p);
    }

    @Override
    public void move(double dx, double dy) {
        pointA.move(dx,dy);
        pointB.move(dx,dy);
        pointC.move(dx,dy);
        center= new Point2D((pointA.getX()+pointB.getX()+pointC.getX())/3,(pointA.getY()+pointB.getY()+pointC.getY())/3);
    }

    @Override
    public void rotate(double alpha) {
        pointA.setCenter(center);
      pointA.rotate(alpha);
      pointB.setCenter(center);
      pointB.rotate(alpha);
      pointC.setCenter(center);
      pointC.rotate(alpha);
    }

    @Override
    public void zoom(double soLan) {
        pointA.setX(pointA.getX() * soLan);
        pointA.setY(pointA.getY() * soLan);

        pointB.setX(pointB.getX() * soLan);
        pointB.setY(pointB.getY() * soLan);

        pointC.setX(pointC.getX() * soLan);
        pointC.setY(pointC.getY() * soLan);
    }


}