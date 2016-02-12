import spock.lang.Specification
import spock.lang.Unroll

class Puzzle98Spec extends Specification {

    @Unroll
    def "circle #circle contains point #point = #result"() {
        expect:

            Puzzle98.isPointInCircle(circle, point) == result
        where:
            circle                                                                    | point                                                                 || result
            circleOf("Center: (2.12, -3.48); Radius: 17.22; Point: (16.21, -5)")      | pointOf("Center: (2.12, -3.48); Radius: 17.22; Point: (16.21, -5)")   || true
            circleOf("Center: (5.05, -11); Radius: 21.2; Point: (-31, -45)")          | pointOf("Center: (5.05, -11); Radius: 21.2; Point: (-31, -45)")       || false
            circleOf("Center: (-9.86, 1.95); Radius: 47.28; Point: (6.03, -6.42)")    | pointOf("Center: (-9.86, 1.95); Radius: 47.28; Point: (6.03, -6.42)") || true
    }

    def Circle circleOf(String expr) {

        def list = expr.split(";")
        def (String cX, String cY) = list[0].split(":")[1].split(",")
        def centerPoint = new Point(Double.valueOf(cX.replace("(", "")), Double.valueOf(cY.replace(")", "")))

        new Circle(centerPoint,  Double.valueOf(list[1].split(":")[1]))

    }

    def Point pointOf(String expr) {
        def list = expr.split(";")
        def (String pX, String pY) = list[2].split(":")[1].split(",")
        new Point(Double.valueOf(pX.replace("(","")), Double.valueOf(pY.replace(")", "")))
    }


}