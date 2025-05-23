
public class palindrome {
     public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Compare characters from both ends
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Test it
    public static void main(String[] args) {
        String input = "madam";
        System.out.println(isPalindrome(input)); // true
    }
}

//for string use
// s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    

