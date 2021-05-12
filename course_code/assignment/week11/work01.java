/*
【问题描述】
编写一函数strend(s, t)，如果字符串t出现在字符串s的尾部，该函数返回1，否则返回0。要求在main函数中测试该函数：先从键盘输入字符串s、t（不超过100个字符），然后调用该函数，并输出返回的结果。

【输入形式】
从键盘分行输入两个字符串：s，t

【输出形式】
输出有两种可能，Yes或No

【输入样例】
abcdefgh
fgh
【输出样例】
Yes

【样例说明】
输入了两个字符串s，t，发现t是在s的尾部，则输出Yes
【评分标准】
该题要求输出一个判断值。
*/

import java.util.Scanner;
public class work01 {
    static int strend(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        char str[] = s.toCharArray();
        char ttr[] = t.toCharArray();
        for (int i = lens - lent, j = 0; i < lens && j < lent; i++, j++) {
            if (str[i] == ttr[j]) {
                continue;
            } else return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        String s = cin.nextLine();
        String t = cin.nextLine();
        int flag = strend(s, t);
        if (flag == 1) {
            System.out.println("Yes");
        } else if (flag == 0) {
            System.out.println("No");
        }
    }

    static Scanner cin = new Scanner(System.in);
}
