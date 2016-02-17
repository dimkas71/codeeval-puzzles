import spock.lang.Specification
import spock.lang.Unroll


class Puzzle144Spec extends Specification {
    @Unroll
    def "for the sequence [a^n] where a #a and #n result should be #digits"() {
        expect:
        Puzzle144.digitsOf(a, n) == digits
        where:
            a                   |   n   || digits
            2                   | 5     || "0: 0, 1: 0, 2: 2, 3: 0, 4: 1, 5: 0, 6: 1, 7: 0, 8: 1, 9: 0"
    }


}