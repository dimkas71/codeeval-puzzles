import spock.lang.Specification

class Puzzle14Spec extends Specification {
    def "current memory model is not the BigEndian but the LittleEndian"() {
        expect:
        !Puzzle14.isBigEndian()
    }
}