import spock.lang.Specification
import spock.lang.Unroll

class Puzzle99Spec extends Specification {
    @Unroll
    def "the distance between point 1 #point1 and point 2 #point2 equeals #distance"() {
        expect:
            Puzzle99.distanceBetween(point1, point2) == distance
        where:
            point1              |  point2               || distance
            pointOf("(25, 4")   | pointOf("(1, -6")     || 26
            pointOf("(47, 43")  | pointOf("(-25, -11")  || 90
    }

    def pointOf(String expr) {
        def list = expr.split(",")
        new Point(Integer.valueOf(list[0].replace("(", "").trim()), Integer.valueOf(list[1].replace(")", "").trim()))

    }
}