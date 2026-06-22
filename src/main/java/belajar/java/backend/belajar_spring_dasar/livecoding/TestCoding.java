package belajar.java.backend.belajar_spring_dasar.livecoding;

public class TestCoding {

    public static void main(String[] args) {
        System.out.println("katak -> " + isPalindrome("katak"));
        System.out.println("Malam -> " + isPalindrome("Malam"));
        System.out.println("java -> " + isPalindrome("java"));
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        String lowerText = text.toLowerCase();

        int left = 0;
        int right = lowerText.length() - 1;

        while (left < right) {
            if (lowerText.charAt(left) != lowerText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
