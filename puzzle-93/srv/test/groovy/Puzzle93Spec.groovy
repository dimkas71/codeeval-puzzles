import spock.lang.Specification
import spock.lang.Unroll


class Puzzle93Spec extends Specification {
    @Unroll
    def "in sentence #sentence all words should be capitalized #output"() {
        expect:
        Puzzle93.capitalizeWordsIn(sentence) == output
        where:
            sentence                || output
            "Hello world"           || "Hello World"
            "javaScript language"   || "JavaScript Language"
            "a letter"              || "A Letter"
            "1st thing"             || "1st Thing"
            ""                      ||  ""
            "a t"                   || "A T"
            "2 t"                   ||  "2 T"
    }
}