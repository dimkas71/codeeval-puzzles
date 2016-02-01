import spock.lang.Specification
import spock.lang.Unroll


class Puzzle32Spec extends Specification {
    @Unroll
    def "check if the string #first contains the second #second at the end of the first #result"() {
        expect:
        Puzzle32.checkIfContainsAtTheEnd(first, second) == result

        where:
            first           | second                    || result
            "Hello World"   | "World"                   || true
            "Hello CodeEval"| "CodeEval"                || true
            "San Francisco" | "San Jose"                || false

    }
}