import java.util.Stack;

public class Puzzle68 {
    private static char LB = '(';
    private static char RB = ')';

    private static char LF = '{';
    private static char RF = '}';

    private static char LS = '[';
    private static char RS = ']';


    static Stack<Character> sStack = new Stack<Character>();


    public static boolean isValidExpression(String expression) {

        boolean isValid = true;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if ((c == LB) ||
                    (c == LF) ||
                    (c == LS)) {
                sStack.push(c);
            }

            if (c == RB) {
                if (!sStack.isEmpty()) {
                    char left = sStack.pop();
                    if (left != LB) {
                        isValid = false;
                        break;
                    }

                } else {
                    isValid = false;
                    break;
                }
            }

            if (c == RF) {
                if (!sStack.isEmpty()) {
                    char left = sStack.pop();
                    if (left != LF) {
                        isValid = false;
                        break;
                    }

                } else {
                    isValid = false;
                    break;
                }
            }

            if (c == RS) {
                if (!sStack.isEmpty()) {
                    char left = sStack.pop();
                    if (left != LS) {
                        isValid = false;
                        break;
                    }

                } else {
                    isValid = false;
                    break;
                }
            }



        }

        return isValid;
    }
}
