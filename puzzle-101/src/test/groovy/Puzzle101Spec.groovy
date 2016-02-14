import spock.lang.Specification
import spock.lang.Unroll

import java.util.regex.Pattern

class Puzzle101Spec extends Specification {
    @Unroll
    def "find if the four points(#point1, #point2, #point3, #point4) makes a square"() {
        expect:
        Puzzle101.makesSquare(point1, point2, point3, point4) == isSquare
        where:
        [point1, point2, point3, point4] << [
                listOfPoints("(1,6), (6,7), (2,7), (9,1)"),
                listOfPoints("(4,1), (3,4), (0,5), (1,2)"),
                listOfPoints("(4,6), (5,5), (5,6), (4,5)"),
                listOfPoints("(4,6), (4,6), (5,5), (4,5)"),
                listOfPoints("(4,6), (4,6), (4,6), (4,6)")
        ]

        isSquare << [false, false, true, false, false]

    }

    def listOfPoints(String expr) {
        def p = Pattern.compile(/(\([-0-9]+\,[-0-9]+\))/)
        def m = p.matcher(expr)

        def list = []
        while (m.find()) {
            def group = m.group()
            list << new Point(Integer.valueOf(group.split(",")[0].replace("(","").trim()),
                    Integer.valueOf(group.split(",")[1].replace(")","").trim()))
        }
        list
    }
}