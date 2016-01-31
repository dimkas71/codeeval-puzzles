import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Puzzle24 {
    public static int sumOf(String[] lines) {
        int sum = 0;
        for (String line : lines) {
            sum += Integer.parseInt(line.trim());
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        InputStream is = Puzzle24.class.getClassLoader().getResourceAsStream("input.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(is));


        ArrayList<String> tmp = new ArrayList<String>();

        String line;
        while ((line = br.readLine()) != null) {
            tmp.add(line);
        }

        br.close();

        System.out.println(sumOf(tmp.toArray(new String[0])));

    }
}
