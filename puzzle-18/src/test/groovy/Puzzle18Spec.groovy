import spock.lang.Specification
import spock.lang.Unroll

class Puzzle18Spec extends Specification {
    @Unroll
    def "the smallest multiple of #n that greater then #x is #result"() {
        expect:
        Puzzle18.smallestOf(x, n) == result
        where:
            x           | n     || result
            13          | 8     || 16
            17          | 16    || 32
    }
}