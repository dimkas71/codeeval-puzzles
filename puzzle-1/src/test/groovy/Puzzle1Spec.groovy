import spock.lang.Specification
import spock.lang.Unroll

class Puzzle1Spec extends Specification {
    @Unroll
    def "for input data #input should be the result #result"() {
        expect:
        Puzzle1.process(input) == result
        where:
            input                || result
            "3 5 10"             || "1 2 F 4 B F 7 8 F B"
            "2 7 15"             || "1 F 3 F 5 F B F 9 F 11 F 13 FB 15"
            "3 5 15"             || "1 2 F 4 B F 7 8 F B 11 F 13 14 FB"
    }
}