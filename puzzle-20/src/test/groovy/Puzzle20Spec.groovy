import spock.lang.Specification
import spock.lang.Unroll


class Puzzle20Spec extends Specification {
    @Unroll
    def "lower case for the string #source should be #dest"() {
        expect:
        Puzzle20.toLowerCase(source) == dest
        where:
            source              || dest
            "HELLO CODEEVAL"    || "hello codeeval"
            "This is some text" || "this is some text"
    }
}