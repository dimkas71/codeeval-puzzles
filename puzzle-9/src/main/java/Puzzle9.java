
public class Puzzle9 {
    public static String print(String input) {
        String[] strings = input.split("\\s+");
        StackImpl stack = new StackImpl();
        for (String string : strings) {
            stack.push(Integer.parseInt(string.trim()));
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop() + " ");
            if (stack.empty()) {
                break;
            }
            stack.pop(); //skip the one element
        }

        return sb.toString().trim();
    }
}
