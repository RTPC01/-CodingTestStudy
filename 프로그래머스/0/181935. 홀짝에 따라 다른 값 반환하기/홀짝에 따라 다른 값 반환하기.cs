using System;

public class Solution {
    public int solution(int n) {
        return result(n);
    }
    
    protected int result(int n) {
        bool flag = (n % 2 == 0);
        
        int answer = 0;
        if (flag == false) 
        {
            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {
                    answer += i;
                }
            }
        }
        else
        {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += (i * i);
                }
            }
        }
        
        return answer;
    }
}