import spock.lang.Specification
import spock.lang.Unroll

class Puzzle149Spec extends Specification {
    @Unroll
    def "sequence zeroes[#sequence] converted to #value"() {
        expect:
            Puzzle149.convertFrom(sequence) == value
        where:
            sequence                                    || value
            "00 0 0 00 00 0"                            || 9
            "00 0"                                      || 1
            "00 0 0 000 00 0000000 0 000"               || 9208
            "0 000000000 00 00"                         || 3

    }
}