import spock.lang.Specification
import spock.lang.Unroll

class Puzzle112Spec extends Specification {
    @Unroll
    def "for statement #source should be #output"() {
        expect:
            Puzzle112.swap(source) == output
        where:
            source                              || output
            "1 2 3 4 5 6 7 8 9 : 0-8"           || "9 2 3 4 5 6 7 8 1"
            "1 2 3 4 5 6 7 8 9 10 : 0-1, 1-3"   || "2 4 3 1 5 6 7 8 9 10"
    }
}