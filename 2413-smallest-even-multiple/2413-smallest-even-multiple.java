class Solution {
    public int smallestEvenMultiple(int n) {
        int nn = 0;
        if(n % 2 != 0){
            nn = n * 2;
            return nn;
        }
        return n;
    }
}