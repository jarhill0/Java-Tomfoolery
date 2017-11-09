package W11;

public class PalindromeCounter {
    private int palindromes = 0;

    public PalindromeCounter(int start, int finish) {
        for (int i = start; start < finish; start++) {
            if (isPalindrome(i)) {
                palindromes++;
            }
        }
    }

    public PalindromeCounter(int finish) {
        new PalindromeCounter(0, finish);
    }

    public int getPalindromes() {
        return palindromes;
    }

    private boolean isPalindrome(int num) {
        return num == new DigitSum(num).getReversed();
    }
}
