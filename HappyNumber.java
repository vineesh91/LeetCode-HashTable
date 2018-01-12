import java.util.Hashtable;

public class HappyNumber {
    public boolean isHappy(int n) {
        int sum = 0;
        int num = n;
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        while (sum!= 1) {
            if (ht.containsKey(num))
                return false;
            else
                ht.put(num,1);
            sum = sumSquares(num);
            num = sum;
        }
        return true;
    }
    public int sumSquares (int num) {
        int sum = 0;
        while (num > 0) {
            sum += (int)Math.pow(num%10,2);
            num = num/10;
        }
        return sum;
    }
}
