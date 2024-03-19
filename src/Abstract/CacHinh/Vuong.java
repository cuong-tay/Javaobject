package Abstract.CacHinh;

public class Vuong extends Hcn {

    public Vuong(double dai, double rong) {
        super(dai, rong);
    }

    public Vuong(String color, boolean filled, double dai, double rong) {
        super(color, filled, dai, rong);
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
        return "Vuong{" +
                "size=" + dai+//dai==rộng vì là hình vuông
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
