
public class Circle {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return center != null ? center.equals(circle.center) : circle.center == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = center != null ? center.hashCode() : 0;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("center=").append(center);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    public boolean containsPoint(Point thatPoint) {
        double normalizedX = thatPoint.getX() - center.getX();
        double normalizedY = thatPoint.getY() - center.getY();

        return  Math.sqrt(normalizedX * normalizedX + normalizedY * normalizedY) <= radius;

    }

}
