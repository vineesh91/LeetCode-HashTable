import java.util.HashMap;

public class CitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int incr = 0;
        HashMap<Integer,Integer> maxes = new HashMap<>();
        for(int i = 0; i < grid.length; i++) {
            for(int j =0; j < grid[0].length; j++) {
                if(maxes.containsKey(i)) {
                    if(maxes.get(i) < grid[i][j])
                        maxes.put(i,grid[i][j]);
                }
                else {
                    maxes.put(i,grid[i][j]);
                }
                if(maxes.containsKey(50+j)) {
                    if(maxes.get(50+j) < grid[i][j])
                        maxes.put(50+j,grid[i][j]);
                }
                else {
                    maxes.put(50+j,grid[i][j]);
                }
            }
        }
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                incr += Math.min(maxes.get(i),maxes.get(50+j)) - grid[i][j];
            }
        }
        return incr;
    }
}
