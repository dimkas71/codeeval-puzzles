import spock.lang.Specification
import spock.lang.Unroll

class Puzzle12Spec extends Specification {
    @Unroll
    def "the first non-repeated character of #string is #character"() {
        expect:
        Puzzle12.firstNonRepeatedOf(string) == character

        where:
            string          || character
            "yellow"        || "y"
            "tooth"         || "h"
            "toothh"        || ""
    }

}