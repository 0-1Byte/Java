import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
            BigInteger ans = new BigInteger("1");
            for (int i = 2; i <= 1977; i++) {
                ans = ans.multiply(new BigInteger(Integer.toString(i)));
            }
            System.out.println(ans);
        }
    }
 
