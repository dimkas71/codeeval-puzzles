import spock.lang.Specification
import spock.lang.Unroll

class Puzzle2Spec extends Specification {
    @Unroll
    def "for the input #input result should be #result"() {
        expect:
        Puzzle2.process(input) == result
        where:
            input                             || result
            [
                "2",
                "Hello world",
                "CodeEval",
                "Quick Fox",
                "A",
                "San Francisco"] as String[]  || [
                                                    "San Francisco", "Hello world"] as String[]
    }

}