import spock.lang.Specification
import spock.lang.Unroll

class Puzzle62Spec extends Specification {
    @Unroll
    def "#n mod #m = #result"() {
        expect:
        Puzzle62.mod(n, m) == result
        where:
            n       |   m       || result
            20      |   6       || 2
            2       |   3       || 2
            5       |   3       || 2
            4       |   4       || 0
    }
}