import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Grouping {
    public static void main(final String[] args) throws IOException {

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));

        int n, i = 0;
        n = Integer.parseInt(bufferedReader2.readLine());

        final String[] input = new String[n];

        final Anagram anagram = new Anagram();

        while (i < n) {

            input[i] = bufferedReader.readLine();
            i++;

        }

        List<List<String>> list = anagram.group(input);

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }

    static class Anagram {

        List<List<String>> group(final String[] strs) {

            final List<List<String>> result = new ArrayList<List<String>>();

            final HashMap<String, List<String>> map = new HashMap<>();

            for (final String s : strs) {

                final char[] strString = s.toCharArray();

                Arrays.sort(strString);

                final String Key = new String(strString);

                if (map.containsKey(Key)) {

                    map.get(Key).add(s);
                } else {
                    final List<String> strList = new ArrayList<>();
                    strList.add(s);
                    map.put(Key, strList);

                }

            }

            result.addAll(map.values());
            return result;

        }

    }
}
