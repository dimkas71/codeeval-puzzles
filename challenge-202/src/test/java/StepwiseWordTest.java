import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class StepwiseWordTest {

    @Test
    @Parameters(method = "dataProvider")
    public void createStepwiseSentenceFor(String source, String expected) {
        StepwiseWord converter = new StepwiseWord();
        assertThat(converter.createStepwiseSenteceFor(source), is(equalTo(expected)));

    }

    public Object[] dataProvider() {
        return $(
            $("cat dog hello", "h *e **l ***l ****o"),
            $("stop football play", "f *o **o ***t ****b *****a ******l *******l"),
            $("music is my life", "m *u **s ***i ****c")
        );
    }

}

class StepwiseWord {

    public String createStepwiseSenteceFor(String sentence) {

        String longestWord = findLongestWord(sentence);

        if (longestWord.isEmpty()) return sentence;

        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(longestWord.charAt(0))).append(" ");

        for (int i = 1; i < longestWord.length(); i++) {

            char c = longestWord.charAt(i);

            sb.append(generateStringWithSymbol("*", i))
                    .append(c)
                    .append(" ");
        }

        return sb.toString().trim();

    }

    private String generateStringWithSymbol(String symbol, int length) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(symbol);
        }

        return sb.toString();
    }

    private String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");

        if (words.length == 0) return "";


        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
