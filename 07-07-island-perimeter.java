class Solution {
    public int island_perimeter(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0 || grid == null)
            return 0;

        int output = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    output = +4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        output -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        output -= 2;
                    }
                }
            }
        }
        return output;
    }
}