import spock.lang.Specification
import spock.lang.Unroll

class Puzzle25Spec extends Specification {
    @Unroll
    def "odd numbers from #start to #end = #list"() {
        expect:
        Puzzle25.oddNumbersInRangeAsString(start, end) == list
        where:
            start   |   end || list
            1       |   3   || '1\n3\n'
            1       |   10  || '1\n3\n5\n7\n9\n'
            2       |   3   || '3\n'
            2       |   2   || ''
            3       |   2   || ''
    }
}