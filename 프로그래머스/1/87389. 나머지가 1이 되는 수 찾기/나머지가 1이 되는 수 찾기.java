class Solution {
    public int solution(int n) {
        n -= 1;
        int div = 2;
        int answer = 0;
        while (answer == 0) {
            answer = (n % div == 0) ? div : 0;
            div = (n % div == 0) ? div : div + 1;
        }
        return answer;
    }
}