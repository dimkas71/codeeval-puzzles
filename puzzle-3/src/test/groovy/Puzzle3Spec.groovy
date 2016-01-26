import spock.lang.Specification

class Puzzle3Spec extends Specification {
    def "the largest prime palindrome number of 1000 is 929"() {
        expect:
            Puzzle3.largestPrimePalindromeOf(1000) == 929
    }

    def "the largest prime palindrome number of 500 is 383"() {
        expect:
            Puzzle3.largestPrimePalindromeOf(500) == 383
    }

    def "the largest prime palindrome number of 200 is 191"() {
        expect:
        Puzzle3.largestPrimePalindromeOf(200) == 191
    }


}