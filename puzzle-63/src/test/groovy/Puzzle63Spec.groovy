import spock.lang.Specification
import spock.lang.Unroll


class Puzzle63Spec extends Specification {
    @Unroll
    def "primes from #start to #end -> #numberOfPrimes"() {
        expect:
        Puzzle63.numberOfPrimesOf(start, end) == numberOfPrimes
        where:
            start      |    end     || numberOfPrimes
            2          |    10      || 4
            20         |    30      || 2
            2          |    2       || 1
            4          |    4       || 0
            5          |    2       || 0
            8          |    10      || 0
    }

}