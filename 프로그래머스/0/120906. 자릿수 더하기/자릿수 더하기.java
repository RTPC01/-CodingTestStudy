class Solution {
    public int solution(int n) {
        // int digit = Integer.toString(n).length;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}