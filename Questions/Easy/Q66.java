package Questions.Easy;

public class Q66 {
    public int[] plusOne(int[] digits) {
        boolean carrybit = false;
        digits[digits.length-1]++;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (carrybit) {
                digits[i]++;
            }
            if (digits[i] > 9) {
                carrybit = true;
                digits[i] = 0;
            }
            else {
                return digits;
            }
        }
        int[] answer = new int[digits.length+1];
        answer[0] = 1;
        return answer;
    }
}
