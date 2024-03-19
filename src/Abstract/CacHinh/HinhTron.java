package Abstract.CacHinh;

import Abstract.Shape;

public class HinhTron extends Shape {
    protected double radius;

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public HinhTron(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override//chu vi
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "}";
    }
}
