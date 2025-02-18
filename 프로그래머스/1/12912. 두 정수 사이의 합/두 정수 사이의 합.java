class Solution {
    public long solution(int a, int b) {
        if (a == b) return a;
        
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        long n = b - a + 1;
        long sum = a + b;
        
        long answer = n * sum / 2;
        return answer;
    }
}