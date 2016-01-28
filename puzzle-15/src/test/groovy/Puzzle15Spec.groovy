import spock.lang.Specification

class Puzzle15Spec extends Specification {
    def "current memory model is not the BigEndian but the LittleEndian"() {
        expect:
        !Puzzle15.isBigEndian()
    }
}