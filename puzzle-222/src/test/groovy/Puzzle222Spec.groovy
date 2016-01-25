import spock.lang.Specification
import spock.lang.Unroll

class Puzzle222Spec extends Specification {

    @Unroll
    def "the winner for the list #list of players with black spot #blackSpot is #winner"() {
        expect:
        Puzzle222.chooseWinnerFrom(list, blackSpot) == winner
        where:
            list                                |blackSpot  ||  winner
            null                                | 3         || ""
            []                                  | 3         || ""
            ["John", "Sara", "Tom", "Susan"]    | 3         || "Sara"
            ["John", "Tom", "Mary"]             | 5         || "Mary"
            ["John", "Tom", "Mary"]             | -2        || ""
            ["John"]                            | 3         || "John"
            ["John"]                            | 0         || "John"
            ["John"]                            | -2        || "John"
            ["John", "Tom"]                     | 2         || "John"
            ["John", "Tom"]                     | 1         || "Tom"
    }
}