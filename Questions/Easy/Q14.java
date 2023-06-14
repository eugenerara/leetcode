package Questions.Easy;

/**
 * Longest Common Prefix
 */
public class Q14 {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        //Loop through the letters in first word
        for (int a = 0; a < strs[0].length(); a++) {
            //Compare with the other words in the array
            for (int b = 1; b < strs.length; b++) {
                if (strs[b].length() == a) {
                    return strs[0].substring(0, a);
                }
                //NOTE: If substring (0,0), will return empty string ""
                if (strs[0].charAt(a) != strs[b].charAt(a)) {
                    return strs[0].substring(0, a);
                }
            }
        }
        return strs[0];
    }
}
