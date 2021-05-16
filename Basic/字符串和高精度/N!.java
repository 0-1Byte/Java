/*
题目
计算N!

输入
输入包含不超过50行数据，每行都有一个整数N(0<=N<=500)。

输出
与输入相对应每行输出N的阶乘。 

样例输入
2
4
样例输出
2
24
*/

import java.math.BigInteger;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            BigInteger s = BigInteger.ONE;
            for (int i = 1; i <= n;i++){
                s=s.multiply(new BigInteger(Integer.toString(i)));
            }
            System.out.println(s);
        }
        cin.close();
    }
}
