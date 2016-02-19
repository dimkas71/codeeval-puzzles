import spock.lang.Specification
import spock.lang.Unroll

class Puzzle152Spec extends Specification {
    @Unroll
    def "for an age #age category should be #category"() {
        expect:
            LifeCategory.from(age) == category
        where:
            age                     ||  category
            0                       || "Still in Mama's arms"
            19                      || "College"
    }

}