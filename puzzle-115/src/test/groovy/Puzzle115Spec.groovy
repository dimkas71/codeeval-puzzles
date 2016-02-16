import spock.lang.Specification
import spock.lang.Unroll

class Puzzle115Spec extends Specification {
    @Unroll
    def "mixed list [#list1] is divided on [#list2]"() {
        expect:
        Puzzle115.splitAndJoin(list1) == list2
        where:
            list1                                                          || list2
            "8,33,21,0,16,50,37,0,melon,7,apricot,peach,pineapple,17,21"   || "melon,apricot,peach,pineapple|8,33,21,0,16,50,37,0,7,17,21"
            "24,13,14,43,41"                                               || "24,13,14,43,41"

    }
}