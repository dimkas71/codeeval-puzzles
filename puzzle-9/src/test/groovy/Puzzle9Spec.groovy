import spock.lang.Specification
import spock.lang.Unroll

class Puzzle9Spec extends Specification {
    @Unroll
    def "for input #input should be printed #output"() {
        expect:
        Puzzle9.print(input) == output
        where:
            input               || output
            "1 2 3 4"           || "4 2"
            "10 -2 3 4"         || "4 -2"
            "1 3 5 7 9"         || "9 5 1"
            "1 3 5 7 9 11 13"   || "13 9 5 1"

    }
}