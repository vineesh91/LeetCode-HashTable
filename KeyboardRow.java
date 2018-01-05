import java.util.Hashtable;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] ret = new String[words.length];
        int f = 0;
        Hashtable<Integer, Character> r1 =
                new Hashtable<Integer, Character>() {{
                    put(1, 'q');
                    put(2, 'w');
                    put(3, 'e');
                    put(4, 'r');
                    put(5, 't');
                    put(6, 'y');
                    put(7, 'u');
                    put(8, 'i');
                    put(9, 'o');
                    put(10, 'p');
                }};
        Hashtable<Integer, Character> r2 =
                new Hashtable<Integer, Character>() {{
                    put(1, 'a');
                    put(2, 's');
                    put(3, 'd');
                    put(4, 'f');
                    put(5, 'g');
                    put(6, 'h');
                    put(7, 'j');
                    put(8, 'k');
                    put(9, 'l');
                }};
        Hashtable<Integer, Character> r3 =
                new Hashtable<Integer, Character>() {{
                    put(1, 'z');
                    put(2, 'x');
                    put(3, 'c');
                    put(4, 'v');
                    put(5, 'b');
                    put(6, 'n');
                    put(7, 'm');
                }};
        for (int i = 0; i < words.length; i++) {
            String origWord = words[i];
            String word = origWord.toLowerCase();
            Hashtable<Integer, Character> row = r1;
            if (word.length() > 1) {
                if (r1.containsValue(word.charAt(0)))
                    row = r1;
                else if (r2.containsValue(word.charAt(0)))
                    row = r2;
                else
                    row = r3;
                boolean possible = true;
                for (int j = 0; j < word.length(); j++) {
                    if (!row.containsValue(word.charAt(j)))
                        possible = false;
                }
                if (possible == true) {
                    ret[f] = origWord;
                    f++;
                }
            } else {
                ret[f] = origWord;
                f++;
            }

        }
        String[] finalWords = new String[f];
        for (int i = 0; i < f; i++) {
            finalWords[i] = ret[i];
        }
        return finalWords;

    }
}
