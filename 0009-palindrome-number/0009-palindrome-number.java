class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int original = x;
        int reverse = 0;
        // while(x > 0){
        //     int digit = x % 10;
        //     reverse = reverse * 10 + digit;
        //     x /= 10;
        // }
        do{
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }while(x > 0);
    

        if(original == reverse){
            return true;
        }
        return false;
    }
}