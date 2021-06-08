/*
【问题描述】
定义一个抽象类几何图形类
属性：面积、周长、形状
抽象方法：求面积 求周长
成员方法：输出图形面积、周长
圆形类继承几何图形类 
定义自己的属性：半径
实现抽象方法
长方形类继承几何图形类
定义自己的属性：长、宽
实现抽象方法
正方形类继承几何图形类
定义自己的属性：边长
实现抽象方法
用户选择图形：1.圆形 2 长方形 3 正方形
输出图形面积和周长
*/
package week15;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class work01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner cin = new Scanner(System.in, "utf-8");
		PrintStream ps = new PrintStream(System.out, true, "utf-8");
		ps.println("选择图形：1.圆形 2 长方形 3 正方形");

		int n = cin.nextInt();

		switch (n) {
		case 1:
			ps.print("输入圆形半径r:");
			double r = cin.nextDouble();
			Figure c = new Circle(r);
			c.printInfo();
			break;
		case 2:

			ps.print("输入长方形长和宽(用英文逗号分隔):");
			String s = cin.next();
			String[] str = s.split(",");
			double length = Double.valueOf(str[0]);
			double width = Double.valueOf(str[1]);
			Figure re = new Rectangle(length, width);
			re.printInfo();
			break;
		case 3:
			ps.print("输入正方形边长:");
			double side = cin.nextDouble();
			Figure sq = new square(side);
			sq.printInfo();
			break;
		}

	}

}

abstract class Figure {
	double area;
	double c;
	String shape;

	abstract double area();// 面积

	abstract double c();// 周长

	void printInfo() throws UnsupportedEncodingException {
		PrintStream ps = new PrintStream(System.out, true, "utf-8");
		ps.printf(shape + "面积:");
		ps.printf("%.2f", area());
		ps.printf("," + "周长:");
		ps.printf("%.2f", c());
	}

}

class Circle extends Figure {
	double r;
	String shape = "圆形";

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	double c() {
		return 2 * Math.PI * r;
	}

	@Override
	double area() {
		return Math.PI * r * r;
	}

	void printInfo() throws UnsupportedEncodingException {
		PrintStream ps = new PrintStream(System.out, true, "utf-8");
		ps.printf(shape + "面积:");
		ps.printf("%.2f", area());
		ps.printf("," + "周长:");
		ps.printf("%.2f", c());

	}

}

class square extends Figure {
	double side;
	String shape = "正方形";

	public square(double side) {
		super();
		this.side = side;
	}

	double area() {
		return side * side;
	}

	double c() {
		return 4 * side;
	}

	void printInfo() throws UnsupportedEncodingException {
		PrintStream ps = new PrintStream(System.out, true, "utf-8");
		ps.printf(shape + "面积:");
		ps.printf("%.2f", area());
		ps.printf("," + "周长:");
		ps.printf("%.2f", c());
	}
}

class Rectangle extends Figure {
	double length;
	double width;
	String shape = "长方形";

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	double area() {
		return length * width;
	}

	double c() {
		return 2 * (length + width);
	}

	void printInfo() throws UnsupportedEncodingException {
		PrintStream ps = new PrintStream(System.out, true, "utf-8");
		ps.printf(shape + "面积:");
		ps.printf("%.2f", area());
		ps.printf("," + "周长:");
		ps.printf("%.2f", c());
	}

}
