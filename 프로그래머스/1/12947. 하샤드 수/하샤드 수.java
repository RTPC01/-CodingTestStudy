class Solution {
    public boolean solution(int x) {
        
        String y = Integer.toString(x);
        
        int digit = y.length();
        
        int sum = 0;
        
        for (int i = 0; i < digit; i++) {
            char ch = y.charAt(i);
            
            sum += Character.getNumericValue(ch);
        }
        
        if (x % sum == 0) {
            return true;
        }
        
        return false;
    }
}