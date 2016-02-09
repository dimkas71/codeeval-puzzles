import spock.lang.Specification
import spock.lang.Unroll


class Puzzle76Spec extends Specification {
    @Unroll
    def "template string #template is matched by rotation of original string #original"() {
        expect:
        Puzzle76.matchesByRotation(original, template)
        where:
            original            | template
            "Hello"             | "lloHe"
            "Basefont"          | "tBasefon"
    }

}