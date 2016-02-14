import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class Point {
    private final double x;
    private final double y;
    private static Logger LOG = Logger.getLogger(Point.class.getSimpleName());
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = (int)x;
        result = (int)(31 * result + y);
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static boolean makesSquare(Point p1, Point p2, Point p3, Point p4) {

        boolean makesSquare = true;

        double d12 = distance(p1, p2);
        double d13 = distance(p1, p3);
        double d14 = distance(p1, p4);

        if ((d12 == d13) && (d12 != d14)) {

            if (!isAngleEquals90(p1, p2, p3)) {
                makesSquare = false;
            } else {

                double d42 = distance(p4, p2);
                double d43 = distance(p4, p3);

                if (d42 == d43) {
                    if (!isAngleEquals90(p4, p2, p3)) {
                        makesSquare = false;
                    }
                } else {
                    makesSquare = false;
                }


            }

        } else if ((d12 == d14) && (d12 != d13)) {
            if (!isAngleEquals90(p1, p2, p4)) {
                makesSquare = false;
            } else {
                double d32 = distance(p3, p2);
                double d34 = distance(p3, p4);

                if (d32 == d34) {
                    if (!isAngleEquals90(p3, p2, p4)) {
                        makesSquare = false;
                    }
                } else {
                    makesSquare = false;
                }
            }

        } else if ((d13 == d14) && (d13 != d12)) {

            if (!isAngleEquals90(p1, p3, p4)) {
                makesSquare = false;
            } else {
                double d23 = distance(p2, p3);
                double d24 = distance(p2, p4);

                if (d23 == d24) {
                    if (!isAngleEquals90(p2, p3, p4)) {
                        makesSquare = false;
                    }
                } else {
                    makesSquare = false;
                }
            }

        } else {
            makesSquare = false;
        }

        return makesSquare;
    }

    private static boolean isAngleEquals90(Point p1, Point p2, Point p3) {
        return (p2.getX() - p1.getX()) * (p3.getX() - p1.getX()) +
                (p2.getY() - p1.getY()) * (p3.getY() - p1.getY()) == 0;
    }

    private static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

}
