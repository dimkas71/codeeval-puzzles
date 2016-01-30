import spock.lang.Specification
import spock.lang.Unroll

class Puzzle22Spec extends Specification {
    @Unroll
    def "Fib(#number) = #result"() {
        expect:
        Puzzle22.fib(number) == result
        where:
            number          || result
            0               || 0
            1               || 1
            2               || 1
            3               || 2
            4               || 3
            5               || 5
            6               || 8
            12              || 144
    }
}