/*
题目描述
小数字的计算很多时候并不能满足现实的需要，现在需要输入两个数字a，b，计算a+b的和。
其中0<=a,b<10^100.
输入
a b
输出
a+b

样例输入
1 2
100 122
1000000000000000000000 2
样例输出
3
222
1000000000000000000002
*/
import java.math.BigInteger;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            BigInteger a=cin.nextBigInteger();
            BigInteger b=cin.nextBigInteger();
            System.out.println(a.add(b));
        }
        cin.close();
    }
}
