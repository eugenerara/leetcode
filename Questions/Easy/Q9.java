package Questions.Easy;

/**
 * Palindrome Number
 */
public class Q9 {
    public boolean isPalindrome(int x) {
        //Convert to String
        String input = String.valueOf(x);
        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(input.length()-(i+1))) {
                return false;
            }
        }
        return true;
    }
}
