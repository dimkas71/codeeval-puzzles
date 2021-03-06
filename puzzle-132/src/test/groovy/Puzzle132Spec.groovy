import spock.lang.Specification
import spock.lang.Unroll

class Puzzle132Spec extends Specification {
    @Unroll
    def "the major element of [#list] is #majorElement"() {
        expect:
        Puzzle132.findMajorOf(list) == majorElement
        where:
            list                                                                                    || majorElement
            "92,19,19,76,19,21,19,85,19,19,19,94,19,19,22,67,83,19,19,54,59,1,19,19"                || 19
            "92,11,30,92,1,11,92,38,92,92,43,92,92,51,92,36,97,92,92,92,43,22,84,92,92"             || 92
            "4,79,89,98,48,42,39,79,55,70,21,39,98,16,96,2,10,24,14,47,0,50,95,20,95,48,50,12,42"   || -1
    }
}