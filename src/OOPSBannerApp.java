import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        printWord("OOPS", patternMap);
    }

    // Build character → pattern map
    static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };

        map.put('O', O);
        map.put('P', P);
        map.put('S', S);

        return map;
    }

    // Print word using patterns
    static void printWord(String word, Map<Character, String[]> map) {
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}
