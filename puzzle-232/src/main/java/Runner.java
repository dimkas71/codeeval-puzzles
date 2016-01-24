import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

/**
 * Created by dimkas71 on 23.01.16.
 */
public class Runner {
    public static void main(String[] args) {
        URL resource = Runner.class.getClassLoader().getResource("testdata.txt");

        Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();

        try {
            File file = new File(resource.toURI());

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = "";

            int iterationSteps = 0;


            while ((line = reader.readLine()) != null) {

                if ("".equals(line.trim())) {
                    continue;
                }

                String[] splittedLine = line.split("\\|");
                int steps = Integer.parseInt(splittedLine[1].trim());

                String[] toParseIntoInteger = splittedLine[0].trim().split("\\s+");
                Integer[] integers = new Integer[toParseIntoInteger.length];

                for (int i = 0; i < toParseIntoInteger.length; i++) {
                    integers[i] = Integer.parseInt(toParseIntoInteger[i]);
                }
                map.put(steps, integers);
            }

            reader.close();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Integer[]> results = new ArrayList<>();

        for (Integer integer : map.keySet()) {
            //TODO: put silly sorting algorithm here...
            Integer[] dest = Puzzle232.process(map.get(integer), integer);
            results.add(dest);
        }

        assert Arrays.deepEquals(results.get(0), Arrays.asList(3, 4, 2, 1).toArray(new Integer[0]));
        assert Arrays.deepEquals(results.get(1), Arrays.asList(4, 3, 5, 2, 1).toArray(new Integer[0]));



    }
}
