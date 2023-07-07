package Questions.Easy;

public class Q58 {
    public int lengthOfLastWord(String s) {
        int lastIndex = s.length();

        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ') {
                lastIndex--;
            }
            if (s.charAt(i) != ' ' && s.charAt(i-1) == ' ') {
                return s.substring(i, lastIndex).length();
            }
        }
        return s.trim().length();
    }
}
