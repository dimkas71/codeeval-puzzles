import spock.lang.Specification
import spock.lang.Unroll

class Puzzle104Spec extends Specification {
    @Unroll
    def "string #input should be converted to #output"() {
        expect:
        Puzzle104.convertToNumbersAsString(input) == output
        where:
            input                                    || output
            "zero;two;five;seven;eight;four"         || "025784"
            "three;seven;eight;nine;two"             || "37892"
            "one;nine;seven;one;five;one;two"        || "1971512"
    }
}