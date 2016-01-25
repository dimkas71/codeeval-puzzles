import spock.lang.Specification
import spock.lang.Unroll


class Puzzle231Spec extends Specification {

    def "should thrown NullPointerException when proccess null as the first parameter"() {
        when:
        def list = Puzzle231.process(null, 0);

        then:
            def e = thrown(NullPointerException)
            e.message == "Source should not be null"
    }

    @Unroll
    def "sorting list #list for #iter iterations should return #dest"() {
        expect:
            Puzzle231.process(list as Integer[], iter) == dest as Integer[]

        where:
            list                            | iter      || dest
            []                              | 1         || []
            [1, 3, 5]                       | 0         || [1, 3, 5]
            [1, 3, 5]                       | -100      || [1, 3, 5] //very funny tests(look at the iter field
            [2, 1]                          | 1         || [1, 2]
            [5, 4, 9, 10, 7, 3, 2, 1, 6]    | 1         || [1, 4, 5, 9, 7, 3, 2, 6, 10]
            [9, 8, 7, 6, 5, 4, 3, 2, 1]     | 3         || [1, 2, 3, 6, 5, 4, 7, 8, 9]
            [9, 8, 7, 6, 5, 4, 3, 2, 1]     | 4         || [1, 2, 3, 4, 5, 6, 7, 8, 9]
            [9, 8, 7, 6, 5, 4, 3, 2, 1]     | 5         || [1, 2, 3, 4, 5, 6, 7, 8, 9]
            [9, 8, 7, 6, 5, 4, 3, 2, 1]     | 10        || [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }



}