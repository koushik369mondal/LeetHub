class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }

        int remainder = num % 9;

        if (remainder == 0) {
            return 9;
        } else {
            return remainder;
        }
    }
}