import spock.lang.Specification
import spock.lang.Unroll

class PointSpec extends Specification {
    def "point should be in a circle"() {

        when:
            def pointToCheck = new Point(1.0d, 0.0d)
            def circleCenter = new Point(0.0d, 0.0d)
            def circle = new Circle(circleCenter, 2.0d)
            def containsPoint = circle.containsPoint(pointToCheck)
        then:
            containsPoint

    }

    def "circle should contains its center"() {

        when:
            def center = new Point(0d,0d)
            def circle = new Circle(center, 1.2d)
            def circlesCenter = circle.containsPoint(center)
        then:
            circlesCenter

    }

    def "point should not be in a circle"() {
        when:
            def circle = new Circle(new Point(0d, 0d), 1)
        then:
            !circle.containsPoint(new Point(2, 2))

    }

    @Unroll
    def "circle [(0,0), 1] not contains point #point"() {
        expect:
            def circle = new Circle(new Point(0, 0), 1)
            def p = parse(point)
            !circle.containsPoint(p)
        where:
            point << [
                "1.2 1.3",
                "1.3 2.3",
                "-1.2 -2.0",
                "-3.0 -2.5",
                "-1.0 -1.0"
        ]
    }

    @Unroll
    def "circle [(0,0), 1] contains point #point"() {
        when:
            def circle = new Circle(new Point(0, 0), 1)
            def p = parse(point)
        then:
            circle.containsPoint(p)
        where:
            point << [
                "0 0",
                "0.5 0",
                "0 0.5",
                "0.1 0.6",
                "-0.4 -0.3",
                "-1.0 0",
                "1.0 0",
                "0 1.0",
                "0 -1.0"
            ]
    }



    //helper function for parsing string like "1.0 -2.3" to Point
    private def Point parse(String expr) {
        def (x, y) = expr.split(" ")
        new Point(Double.valueOf(x), Double.valueOf(y))
    }


}