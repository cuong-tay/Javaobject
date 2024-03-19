package OOP.Paint;

//đoạn thẳng
public class Line implements Shape {
    private Point2D startPoint;
    private Point2D endPoint;

    private Point2D center;
    public Line() {
    }

    public Line(Point2D startPoint, Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        center = new Point2D((startPoint.getX()+endPoint.getX())/2,(startPoint.getY()+endPoint.getY())/2);
    }

    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    // Phương thức tính chiều dài đoạn thẳng
    public double length() {
        double deltaX = endPoint.getX() - startPoint.getX();
        double deltaY = endPoint.getY() - startPoint.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Phương thức in thông tin đoạn thẳng
    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
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
        return center.distance(p);
    }

    @Override
    public void move(double dx, double dy) {
        double newStartX = startPoint.getX() + dx;
        double newStartY = startPoint.getY() + dy;

        double newEndX = endPoint.getX() + dx;
        double newEndY = endPoint.getY() + dy;

        startPoint = new Point2D(newStartX, newStartY);
        endPoint = new Point2D(newEndX, newEndY);
        center = new Point2D((startPoint.getX()+endPoint.getX())/2,(startPoint.getY()+endPoint.getY())/2);
    }

    @Override
    public void rotate(double alpha) {
       endPoint.setCenter(startPoint);
       endPoint.rotate(alpha);
        center = new Point2D((startPoint.getX()+endPoint.getX())/2,(startPoint.getY()+endPoint.getY())/2);
    }

    @Override
    public void zoom(double soLan) {
        double centerX = (startPoint.getX() + endPoint.getX()) / 2;
        double centerY = (startPoint.getY() + endPoint.getY()) / 2;


        double newStartX = centerX + (startPoint.getX() - centerX) * soLan;
        double newStartY = centerY + (startPoint.getY() - centerY) * soLan;
        double newEndX = centerX + (endPoint.getX() - centerX) * soLan;
        double newEndY = centerY + (endPoint.getY() - centerY) * soLan;


        startPoint = new Point2D(newStartX, newStartY);
        endPoint = new Point2D(newEndX, newEndY);
    }
}
