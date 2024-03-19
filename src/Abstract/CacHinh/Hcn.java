package Abstract.CacHinh;

import Abstract.Shape;

public class Hcn extends Shape {
    protected double dai,rong;

    public Hcn(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Hcn(String color, boolean filled, double dai, double rong) {
        super(color, filled);
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double getArea() {
        return dai*rong;
    }

    @Override
    public double getPerimeter() {
        return (dai+rong)*2;
    }

    @Override
    public String toString() {
        return "Hcn{" +
                "dai=" + dai +
                ", rong=" + rong +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "}";
    }
}
