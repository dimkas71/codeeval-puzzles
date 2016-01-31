import spock.lang.Specification
import spock.lang.Unroll

class Puzzle24Spec extends Specification {
    @Unroll
    def "sum of lines #lines = #result"() {
        expect:
        Puzzle24.sumOf(lines) == result
        where:
            lines                   ||  result
            ["5","12"] as String[]  || 17

    }
}