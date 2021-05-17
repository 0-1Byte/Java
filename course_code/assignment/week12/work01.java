/*
【问题描述】
编写一个简易计算器类，根据用户的选择执行相关的操作
1.开根号  2.求sinx 3.求cosx 4.求圆面积 5.求以e为底对数

6.求绝对值 7.求大于等于x的最小整数 8.求小于等于x的最大整数

1.开根号2.求sinx 3.求cosx 4.求圆面积5.求以e为底对数6.求绝对值7.求大于等于x的最小整数8.求小于等于x的最大整数输入想执行的数学运算的选项(1-8)
ss
输入格式不正确，请重新输入数字
ss
输入格式不正确，请重新输入数字9
输入数字序号不在1-8之内，请重新输入数字1
输入计算的数:6
结果为:2.449489742783178
*/
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class work01 {
	static boolean isNum(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	static boolean isRange(String str) {
		if (str.length() > 1)
			return false;
		else {
			if (Integer.parseInt(str) >= 1 && Integer.parseInt(str) <= 8) {
				return true;
			} else
				return false;
		}
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		ps.println("1.开根号  2.求sinx 3.求cosx 4.求圆面积 5.求以e为底对数\r\n" + "6.求绝对值 7.求大于等于x的最小整数 8.求小于等于x的最大整数");

		String choice = new String();
		ps.println("输入想执行的数学运算的选项(1-8)");
		while (true) {
			choice = cin.nextLine();
			if (!isNum(choice)) {
				ps.println("输入格式不正确，请重新输入数字");
			} else {
				if (!isRange(choice)) {
					ps.println("输入数字序号不在1-8之内，请重新输入数字");
				} else
					break;
			}
		}
		ps.println("输入计算的数:");
		double num = cin.nextDouble();
		int ans = Integer.parseInt(choice);
		switch (ans) {
		case 1:
			ps.printf("结果为:");
			ps.println(Math.sqrt(num));
			break;
		case 2:
			ps.printf("结果为:");
			ps.println(Math.sin(num));
			break;
		case 3:
			ps.printf("结果为:");
			ps.println(Math.cos(num));
			break;
		case 4:
			ps.printf("结果为:");
			ps.println(Math.PI * num * num);
			break;
		case 5:
			ps.printf("结果为:");
			ps.println(Math.log(num));
			break;
		case 6:
			ps.printf("结果为:");
			ps.println(Math.abs(num));
			break;
		case 7:
			ps.printf("结果为:");
			ps.println(Math.ceil(num));
			break;
		case 8:
			ps.printf("结果为:");
			ps.println(Math.floor(num));
			break;
		}
	}
	static Scanner cin = new Scanner(System.in);
}
