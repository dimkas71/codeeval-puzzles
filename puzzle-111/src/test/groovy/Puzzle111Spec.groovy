import spock.lang.Specification
import spock.lang.Unroll


class Puzzle111Spec extends Specification {
    @Unroll
    def "for the sentence #sentence the longest word #longestWord"() {
        expect:
        Puzzle111.findLongestOf(sentence) == longesWord
        where:
            sentence                        || longesWord
            "some line with text"           ||  "some"
            "another line"                  || "another"
            ""                              || ""
    }
}