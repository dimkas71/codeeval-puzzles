import spock.lang.Specification
import spock.lang.Unroll


class Puzzle16Spec extends Specification {
    @Unroll
    def "number of one bit in the number #number = #bits"() {
        expect:
        Puzzle16.numberOfOneBitIn(number) == bits
        where:
            number              || bits
            10                  || 2
            22                  || 3
            56                  || 3
            8                   || 1
            0                   || 0
            3                   || 2

    }

}