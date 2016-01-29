import spock.lang.Specification
import spock.lang.Unroll

class Puzzle19Spec extends Specification {
    @Unroll
    def "for the number #number the bits in positions #pos1 and #pos2 are the same -> #result"() {
        expect:
        Puzzle19.checkIfSameBitsIn(number, pos1, pos2) == result
        where:

            number      | pos1  | pos2  || result
            86          | 2     | 3     || true
            125         | 1     | 2     || false

    }
}