import spock.lang.Specification
import spock.lang.Unroll

class Puzzle100Spec extends Specification {
    @Unroll
    def "is the number #number even = #result"() {
        expect:
        Puzzle100.isEvenAsInteger(number) == result
        where:
            number                  || result
            701                     || 0
            4123                    || 0
            2936                    || 1
    }
}