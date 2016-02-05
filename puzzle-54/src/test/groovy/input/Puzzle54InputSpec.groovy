package input

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Puzzle54InputSpec extends Specification {
    public static final String INPUT_FILE = "puzzle-54.input"

    @Shared def inputFile = new Util().getFileFromResource(INPUT_FILE)

    def "size of input file"() {
        when:
        def lines = inputFile.readLines()

        then:
        lines.size() == 4

    }

    @Unroll
    def "line #line should contains symbol ';' as delimiter"() {
        expect:
            line.contains(";")
        where:
            line << inputFile.readLines()
    }

    @Unroll
    def "line #line delimited by ';' should has two elements only"() {
        when:
            def splitted = line.split(";")
        then:
            splitted.size() == 2
        where:
            line << inputFile.readLines()
    }

    @Unroll
    def "line #line should be parsed correctly on two number with type Double"() {
        when:

            def splitted = line.split(";")
            def price = Double.valueOf(splitted[0])
            def cash = Double.valueOf(splitted[1])

        then:
            notThrown(NumberFormatException.class)

        where:
            line << inputFile.readLines()
    }



}