import java.util.Hashtable;

public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        if (points.length < 3)
            return 0;
        for (int i = 0; i < points.length; i++) {
            Hashtable<Double,Integer> dpoints = new Hashtable<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    double d = dis(points[i], points[j]);
                    if (dpoints.containsKey(d)) {
                        dpoints.put(d, dpoints.get(d) + 1);
                    } else
                        dpoints.put(d, 1);
                }
            }
            for (Double k : dpoints.keySet()) {
                int c = dpoints.get(k);
                if (c > 1) {
                    count += c * (c-1);
                }
            }
        }
        return count;
    }
    private double dis(int[] a1, int[] a2) {
        return Math.sqrt(Math.pow((a1[0]-a2[0]),2) + Math.pow((a1[1]-a2[1]),2));
    }
}
