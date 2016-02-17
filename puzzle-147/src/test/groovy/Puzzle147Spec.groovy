import spock.lang.Specification
import spock.lang.Unroll


class Puzzle147Spec extends Specification {
    @Unroll
    def "for the #sentence lettercase percentage ratio #output"() {
        expect:
        Puzzle147.writeLetterCaseRatio(sentence) == output
        where:
            sentence                || output
            "thisTHIS"              ||  "lowercase: 50.00 uppercase: 50.00"
            "AAbbCCDDEE"            ||  "lowercase: 20.00 uppercase: 80.00"
            "N"                     ||  "lowercase: 0.00 uppercase: 100.00"
            "UkJ"                   ||  "lowercase: 33.33 uppercase: 66.67"
    }
}