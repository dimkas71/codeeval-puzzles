import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Puzzle57Spec extends Specification {

    @Shared def inFile = new Util().getFileFromResource("puzzle-57.input")
    @Shared def outFile = new Util().getFileFromResource("puzzle-57.output")

    @Unroll
    def "for input data #inline should get output #outline"() {
        expect:
            def (nAsString, mAsString, matrixAsString) = inline.split(";")
            int n = Integer.parseInt(nAsString)
            int m = Integer.parseInt(mAsString)

            def array = matrixAsString.split(" ")

            def matrix = new int[n][m]

            int i = 0, j = 0

            def isFirstCheck = true

            for (int k = 0; k < array.size(); k++) {
                matrix[i][j] = Integer.parseInt(array[k])
                j++
                if (j % m == 0) {
                    j = 0
                    i++
                }
            }

            Puzzle57.getListOf(matrix) == outline.split(" ").collect {Integer.parseInt(it)}

        where:
        inline << inFile.readLines()
        outline << outFile.readLines()
        lineIndex << (0..<inFile.readLines().size())
    }



}