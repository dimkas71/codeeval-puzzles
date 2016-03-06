
public class ComparePoints {

    private final Point p1;
    private final Point p2;

    public ComparePoints(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public String getDirection() {

        if (p1.equals(p2)) {
            return "here";
        }

        if (p1.getX() == p2.getX()) {
            if (p1.getY() < p2.getY()) {
                return "N";
            } else {
                return "S";
            }
        }

        if (p1.getY() == p2.getY()) {
            if (p1.getX() < p2.getX()) {
                return "E";
            } else {
                return "W";
            }
        }

        if (
                (p1.getX() != p2.getX())
                    && (p1.getY() != p2.getY())
                ) {
            if (p1.getX() < p2.getX()) {

                //East should be the horisontal direction
                if (p1.getY() < p2.getY()) {
                    return "NE";
                } else {
                    return "SE";
                }


            } else {

                //West
                if (p1.getY() < p2.getY()) {
                    return "NW";
                } else {
                    return "SW";
                }

            }

        }
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComparePoints that = (ComparePoints) o;

        if (!p1.equals(that.p1)) return false;
        return p2.equals(that.p2);

    }

    @Override
    public int hashCode() {
        int result = p1.hashCode();
        result = 31 * result + p2.hashCode();
        return result;
    }
}
