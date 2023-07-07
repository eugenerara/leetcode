package Questions.Easy;

public class Q28 {
        public int firstOccurringIndex(String haystack, String needle) {
            //Base Case
            if (haystack.equals(needle)) {
                return 0;
            }

            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
            return -1;
        }
}
