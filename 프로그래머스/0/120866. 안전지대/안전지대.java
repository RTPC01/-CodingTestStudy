// 지뢰일경우 상하좌우 대각선 이동을 이중포문으로 처리함.
// 범위가 벗어나는 경우엔 try catch로 넘겨버림.
// 지뢰일경우 상하좌우 대각선에 있는 좌표를 0일 경우에만 -1 로 바꿈
// 한번 더 이중포문을 돌리고, sum값을 구함(0의 갯수만 셈)

class Solution {
    static int[][] copy;
    
    public int solution(int[][] board) {
        copy = board;
        int width = board[0].length;
        int height = board.length;
        int sum = 0;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (copy[i][j] == 1) {
                    for (int y = -1; y < 2; y++) {
                        for (int x = -1; x < 2; x++) {
                            try {
                                if(copy[i + y][j + x] == 0) {
                                    copy[i + y][j + x] = -1;
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                continue;
                            }
                        }
                    }
                } 
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (copy[i][j] == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
    
}