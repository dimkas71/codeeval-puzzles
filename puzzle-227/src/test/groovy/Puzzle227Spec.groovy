import spock.lang.Specification
import spock.lang.Unroll

class Puzzle227Spec extends Specification {

    @Unroll
    def "the card with the number #card is #result with default strategy"() {
        given:
            def puzzle = new Puzzle227()
        expect:
            puzzle.cardTypeOf(card) == result
        where:
            card                    || result
            "9999 9999 9999 9999"   || Puzzle227.CardType.FAKE
            "9999 9999 9999 9993"   || Puzzle227.CardType.REAL
            "1234 5678 9876 5432"   || Puzzle227.CardType.REAL
    }

    @Unroll
    def "the card with the number #card is #result with custom the strategy"() {
        given:
        def strategy = [calculate: {Integer[] list ->

            Integer sum = 0

            list.eachWithIndex { Integer e, Integer i ->
                if ((i % 2) == 0) {
                    sum += e * 2
                } else {
                    sum += e
                }
            }
            println sum
            sum

        }] as ChecksumStrategy
        def puzzle = new Puzzle227(strategy)
        expect:
        puzzle.cardTypeOf(card) == result
        where:
        card                    || result
        "9999 9999 9999 9999"   || Puzzle227.CardType.FAKE
        "9999 9999 9999 9993"   || Puzzle227.CardType.REAL
        "1234 5678 9876 5432"   || Puzzle227.CardType.REAL
    }


}