import spock.lang.Specification
import spock.lang.Unroll


class Puzzle68Spec extends Specification {
    @Unroll
    def "expression #expression is valid -> #isValid"() {
        expect:
        Puzzle68.isValidExpression(expression) == isValid
        where:
            expression              ||  isValid
            "()"                    || true
            "([)]"                  || false
            "(())[{()}]"            || true
            "([]){(([]))}"          || true
            "][]){(([]))}"          || false


    }
}