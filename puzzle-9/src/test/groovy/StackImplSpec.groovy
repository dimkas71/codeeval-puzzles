import spock.lang.Specification

class StackImplSpec extends Specification {

    def "check adding an element to the StackImpl"() {
        given:
        def stack = new StackImpl()

        when:
            stack.push(10)
        then:
            !stack.empty()
            stack.pop() == 10
            stack.empty()
    }

    def "check size of Stack after pushing and poping some elements from the Stack"() {
        given:
            def stack = new StackImpl()
        when:
            stack.push(10)
            stack.push(12)
            stack.push(13)
            def last = stack.pop()
            def beforeLast = stack.pop()
        then:
            !stack.empty()
            stack.size() == 1 //3 elements pushed - 2 elements poped == 1
            last == 13
            beforeLast == 12


    }



}