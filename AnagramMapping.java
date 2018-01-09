import java.util.Hashtable;

public class AnagramMapping {
    public int[] anagramMappings(int[] A, int[] B) {
        Hashtable<Integer,Integer> ht  = new Hashtable<>();
        int[] P = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            ht.put(B[i],i);
        }
        for (int i = 0; i < A.length; i++) {
            P[i] = ht.get(A[i]);
        }
        return P;
    }
}
