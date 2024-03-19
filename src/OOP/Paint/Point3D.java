package OOP.Paint;

public class Point3D extends Point2D{
    //attributes
    private double z;

    public Point3D() {
        super(0,0);
        double z=0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D[" + "x=" + this.getX() +
                ", y=" + this.getY() +
                ", z=" + z +
                ']';
    }

    @Override
    public double distance(Point2D p) {
        if (p instanceof Point3D) {

            Point3D point3D = (Point3D) p;
            double dx = this.getX() - point3D.getX();
            double dy = this.getY() - point3D.getY();
            double dz = this.z - point3D.z;
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        } else {

            return super.distance(p);
        }
    }

    public Point3D diemDX(){
        double dz = (z == 0) ? 0 : -z;

        Point3D result=new Point3D(super.diemDX().getX(),super.diemDX().getY(),dz);
        return result;
    }
    public Point3D tTien3D(Point3D p){
        double dz=z+p.z;
        double dx=getX()+ p.getX();
        double dy=getY()+p.getY();
        Point3D result=new Point3D(dx,dy,dz);
        return result;
    }


    @Override
    public void zoom(double soLan) {

    }
}
