class Solution {
    public int[] solution(long n) {
        // n의 길이를 계산
        int digit = Long.toString(n).length();
        
        // n의 각 자릿수를 저장할 배열
        int[] answer = new int[digit];
        
        // n의 자릿수를 거꾸로 배열에 저장
        for (int i = 0; i < digit; i++) {
            answer[i] = (int) (n % 10); // 마지막 자리 숫자를 배열에 저장
            n /= 10; // 마지막 자리 제거
        }
        
        return answer;
    }
}
