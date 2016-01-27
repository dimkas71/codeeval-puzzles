import spock.lang.Specification


class Puzzle4Spec extends Specification {
    def "sum of the first 1000 prime numbers should equal 3682913"() {
        expect:
        Puzzle4.sumOf(1000) == 3682913
    }
}