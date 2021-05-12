/*
【问题描述】
编写一个程序，从键盘接收一个字符串，然后按照字符顺序从小到大进行排序，并删除重复的字符。

【输入形式】
从键盘输入一个字符串，以回车结束输入。要求程序可以处理含有空格的字符串。

【输出形式】
程序接收此字符串，然后将其按照字符ASCII码值从小到大的顺序进行排序，并删除重复的字符输出。如果字符串为空，输出也应该为空。

【样例输入】
badacgegfacb
【样例输出】
abcdefg

【样例说明】
输入badacgegfacb，然后排序、删除重复字符得到abcdefg。
*/
import java.util.Arrays;
import java.util.Scanner;

public class work02 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        String s = cin.nextLine();
        char[] str = s.toCharArray();
        Arrays.sort(str);
        int i, j, k;
        int n = str.length;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (str[i] == str[j]) {
                    for (k = j; k < n - 1; k++) {
                        str[k] = str[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(str[i]);
        }
    }
}


