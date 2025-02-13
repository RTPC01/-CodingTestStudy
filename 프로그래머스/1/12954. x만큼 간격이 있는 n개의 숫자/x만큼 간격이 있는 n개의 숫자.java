class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long longX = x;
        for (int y = 0; y < n; y++) {
            answer[y] = longX * (y + 1);
        }
        return answer;
    }
}