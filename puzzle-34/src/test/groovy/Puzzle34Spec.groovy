import spock.lang.Specification
import spock.lang.Unroll


class Puzzle34Spec extends Specification {
    @Unroll
    def "for the list #list whose sum is equal to #x should get pairs #pairs separated by ;"() {
        expect:
        Puzzle34.getPairsFor(list, x) == pairs
        where:
            list                    |   x  || pairs
            [1, 2, 3, 4, 6]         | 5    || "1,4;2,3"
            [2, 4, 5, 6, 9, 11, 15] | 20   || "5,15;9,11"
            [1, 2, 3, 4]            | 50   || "NULL"

    }
}