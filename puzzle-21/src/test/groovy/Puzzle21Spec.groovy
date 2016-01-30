import spock.lang.Specification
import spock.lang.Unroll

class Puzzle21Spec extends Specification {
    @Unroll
    def "sum of digits the number #number is #sum"() {
        expect:
        Puzzle21.getSumOfDigits(number) == sum
        where:
            number      || sum
            23          || 5
            496         || 19
            0           || 0
            -1          || 1
            -123        || 6

    }
}