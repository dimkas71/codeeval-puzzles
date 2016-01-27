import spock.lang.Specification
import spock.lang.Unroll


class Puzzle8Spec extends Specification {
    @Unroll
    def "for string \"#input\" reversed by words should be \"#output\""() {
        expect:
            Puzzle8.reverseWordsOf(input) == output
        where:
            input                   || output
            "Hello World"           || "World Hello"
            "Hello CodeEval"        || "CodeEval Hello"
    }
}