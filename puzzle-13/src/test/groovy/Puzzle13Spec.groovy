import spock.lang.Specification
import spock.lang.Unroll


class Puzzle13Spec extends Specification {
    @Unroll
    def "when for string #source symbols from #toRemove are removed should get #dest"() {
        expect:
            Puzzle13.removeAllFrom(source, toRemove) == dest
        where:
            source              | toRemove          || dest
            "how are you"       | "abc"             || "how re you"
            "hello world"       | "def"             || "hllo worl"
            "how are you"       | "zkf"             || "how are you"
            "how are you"       | "hoaryuew"        || ""
    }
}