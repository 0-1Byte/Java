/*
【问题描述】
编写程序将一串文本中所有指定字符串删除，并返回删除后的文本内容及指定删除字符串最后一次出现的位置

【输入形式】
一串字符串文本
指定删除的字符串

【输出形式】
删除后内容
删除字符串位置

【样例输入】
从标准输入中输入要删除的字符串：
dsdsdfalfklkfsionlsfksdlfskfjskdjfl
in
【样例输出】
dsdsdfalfklkfsionlsfksdlfskfjskdjfl
-1

【样例输入】
dsdsdfalfklkfsiinlsfksdlfskfjskdjfl
in
【样例输出】
dsdsdfalfklkfsilsfksdlfskfjskdjfl
15

【样例输入】
dsfafjalfjinaljfwoelinalfalqqfsinlajlf
in
【样例输出】
dsfafjalfjaljfwoelalfalqqfslajlf
31
*/
package string;

import java.io.*;
import java.util.Scanner;

public class work04 {
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        String s;
        String t;
        s = cin.nextLine();
        t = cin.nextLine();
        int index = s.indexOf(t);
        int lastdex=s.lastIndexOf(t);
        s=s.replace(t," ");
        char str[]=s.toCharArray();
        int tot=0;
        for(int i=0;i<s.length();i++){
            if(str[i]==' '){
                tot++;
                for(int j=i;j+1<s.length();j++){
                    str[j]=str[j+1];
                }
            }
        }
        for(int i=0;i<s.length()-tot;i++){
            System.out.print(str[i]);
        }
        System.out.println();
        System.out.println(lastdex);
    }
}

