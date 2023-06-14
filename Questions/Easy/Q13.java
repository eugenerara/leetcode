package Questions.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer
 */
public class Q13 {
    public int romanToInt(String s) {
        Map<Character, Integer> conversionList =
                Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int result = 0;

        for (int i = 0; (i+1) < s.length(); i++){
            //Compare previous with current index
            if (conversionList.get(s.charAt(i)) < conversionList.get(s.charAt(i+1))) {
                result -= conversionList.get(s.charAt(i));
            }
            else {
                result += conversionList.get(s.charAt(i));
            }
        }
        return result + conversionList.get(s.charAt(s.length()-1));
    }
}
