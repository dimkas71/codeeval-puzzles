import spock.lang.Specification
import spock.lang.Unroll


class Puzzle27Spec extends Specification {
    @Unroll
    def "decimal representation for #number is #binary"() {
        expect:
        Puzzle27.toBinaryString(number) == binary
        where:
            number      ||  binary
            2           ||  "10"
            10          ||  "1010"
            67          ||  "1000011"

    }
}