import spock.lang.Specification
import spock.lang.Unroll


class Puzzle113Spec extends Specification {
    @Unroll
    def "when multiply list 1 = [#list1] and list 2 = [#list2] then should be [#list3]"() {
        expect:
        Puzzle113.multiplyList(list1, list2) == list3
        where:
            list1                                       | list2                                       || list3
            listOf("9 0 6 | 15 14 9")[0]                | listOf("9 0 6 | 15 14 9")[1]                || "135 0 54"
            listOf("5 | 8")[0]                          | listOf("5 | 8")[1]                          || "40"
            listOf("13 4 15 1 15 5 | 1 4 15 14 8 2")[0] | listOf("13 4 15 1 15 5 | 1 4 15 14 8 2")[1] || "13 16 225 14 120 10"
    }


    def listOf(String expression) {
        def list = expression.split("\\|")
        list
    }

}