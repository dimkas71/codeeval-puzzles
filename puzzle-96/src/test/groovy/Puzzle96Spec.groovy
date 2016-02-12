import spock.lang.Specification
import spock.lang.Unroll


class Puzzle96Spec extends Specification {
    @Unroll
    def "for string #input the swapped string #output"() {
        expect:
            Puzzle96.swap(input) == output
        where:
            input                       || output
            "Hello world!"              || "hELLO WORLD!"
            "JavaScript language 1.8"   || "jAVAsCRIPT LANGUAGE 1.8"
            "A letter"                  || "a LETTER"
    }

}