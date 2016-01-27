import spock.lang.Specification
import spock.lang.Unroll

class Puzzle10Spec extends Specification {
    @Unroll
    def "for list #list of characters shuld be printed a character #element"() {
        expect:
        Puzzle10.getCharacterOf(list) == element

        where:
            list            ||  element
            "a b c d 4"     || 'a'
            "e f g h 2"     ||  'g'
            "a b c d 5"     ||  null
    }
}