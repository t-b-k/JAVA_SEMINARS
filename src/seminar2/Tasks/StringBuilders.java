package seminar2.Tasks;

public class StringBuilders {

    public static String printStringOfTwoChars (int n, char c1, char c2) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            str.append(c1);
            str.append(c2);
        }
        return str.toString();
    }
}
