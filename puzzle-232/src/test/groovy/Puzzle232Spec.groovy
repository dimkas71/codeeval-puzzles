import org.junit.runner.RunWith
import spock.lang.Specification
import spock.lang.Unroll;

public class Puzzle232Spec extends Specification {

    @Unroll
    def "for list #list with #iter iteration result should be #dest"() {

        expect:
            Puzzle232.process(list as Integer[], iter) == dest as Integer[]

        where:
            list            | iter || dest
            [4, 3, 2, 1]    | 1    || [3, 4, 2, 1]
            [5, 4, 3, 2, 1] | 2    || [4, 3, 5, 2, 1]
            [5, 4, 3, 2, 1] | 3    || [3, 4, 5, 2, 1]
            [4, 3, 2, 1]    | 0    || [4, 3, 2, 1]
            [4, 3, 2, 1]    | 3    || [2, 3, 4, 1]
            [4, 3, 2, 1]    | 4    || [2, 3, 1, 4]
            [4, 3, 2, 1]    | 5    || [2, 1, 3, 4]
            [4, 3, 2, 1]    | 6    || [1, 2, 3, 4]
            [4, 3, 2, 1]    | 7    || [1, 2, 3, 4]
            [4, 3, 2, 1]    | 10   || [1, 2, 3, 4]
            []              | 2    || []
            [1, 3, 2]       | 1    || [1, 2, 3]
            [1]             | 1    || [1]
    }


}
