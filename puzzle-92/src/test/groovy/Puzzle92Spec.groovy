import spock.lang.Specification
import spock.lang.Unroll


class Puzzle92Spec extends Specification {
    @Unroll
    def "next to last word in string #string is #word"() {
        expect:
        Puzzle92.findNextToLastOf(string) == word
        where:
            string                      ||  word
            "some line with text"       ||  "with"
            "another line"              ||  "another"
            ""                          ||  ""
            "just"                      ||  ""
            "just a simple word"        ||  "simple"
    }
}