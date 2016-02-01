import spock.lang.Specification
import spock.lang.Unroll


class Puzzle29Spec extends Specification {
    @Unroll
    def "after sorting and removing non-unique elements the list #list should be #uniqueList"() {
        expect:
        Puzzle29.sortAndMakeUnique(list) == uniqueList
        where:
            list                                     ||  uniqueList
            [1, 1, 1, 2, 2, 3, 3, 4, 4] as int[]     ||  [1, 2, 3, 4] as int[]
            [2, 3, 4, 5, 5] as int[]                 ||  [2, 3, 4, 5] as int[]

    }
}