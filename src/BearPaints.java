/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mazenbadr
 */
public class BearPaints {

    public long maxArea(int W, int H, long M) {
        long maxA = 0;
        int bigDim = 0;
        long m = M;
        if (W > H) {
            bigDim = W;
        } else {
            bigDim = H;
        }
        int[][] grid = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                grid[i][j] = 0;
            }
        }
//        for (int i = 0; i < bigDim; i++) {
//            if (i < H) {
//                if (i < W) {
//                    if (m > 0) {
//                        if (grid[i][i] == 0) {
//                            grid[i][i] = 1;
//                            m--;
//                        }
//                        for (int row = i + 1; row >= 0; row--) {
//                            if (row < H) {
//                                for (int col = i + 1; col >= 0; col--) {
//                                    if (col < W) {
//                                        if (grid[row][col] == 0 && m > 0) {
//                                            grid[row][col] = 1;
//                                            m--;
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }

        return maxA;
    }
}
