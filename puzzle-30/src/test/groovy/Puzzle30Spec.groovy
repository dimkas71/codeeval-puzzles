import spock.lang.Specification
import spock.lang.Unroll


class Puzzle30Spec extends Specification {
    @Unroll
    def "intersection of #list1 and #list2 = #intersection"() {
        expect:
        Puzzle30.getIntersectionOfAsString(list1, list2) == intersection
        where:
            list1               | list2                 || intersection
            [1, 2, 3, 4]        | [4, 5, 6]             ||  "4"
            [20, 21, 22]        | [45, 46, 47]          ||  "\n"
            [7, 8, 9]           | [8, 9, 10, 11, 12]    ||  "8,9"

    }
}