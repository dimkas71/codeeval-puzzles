import input.Puzzle54InputSpec
import input.Util
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Puzzle54Spec extends Specification {

    @Shared def inFile = new Util().getFileFromResource("puzzle-54.input")
    @Shared def outFile = new Util().getFileFromResource("puzzle-54.output")


    @Unroll
    def "for input \"#inline\" result should be \"#outline\""() {
        expect:

            def (priceAsString, cashAsString) = inline.split(";")

            Puzzle54.getChangeAsString(Double.parseDouble(priceAsString), Double.parseDouble(cashAsString)) == outline
        where:
        inline << inFile.readLines()
        outline << outFile.readLines()

    }

}