/*【问题描述】
定义一个结构体变量用以记录一个日期（包括年，月，日）。输入一个日期，计算该日是本年的第几天。

【输入形式】
输入日期（包括年 月 日），是三个整数，以空格分隔。
【输出形式】
输出该日是本年的第多少天。

【样例输入】
2003 3 25
【样例输出】
84

【样例输入】
2004 3 25
【样例输出】
115
*/

import java.util.Calendar;
import java.util.Scanner;

public class work04 {

	public static void main(String[] args) {
		int year, month, day;
		year = cin.nextInt();
		month = cin.nextInt();
		day = cin.nextInt();
		Calendar c = Calendar.getInstance();
		//c.set(year, month, day);
		c.set(Calendar.YEAR,year);
		c.set(Calendar.MONTH,month-1);
		c.set(Calendar.DAY_OF_MONTH,day);
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
	}

	static Scanner cin = new Scanner(System.in);

}

