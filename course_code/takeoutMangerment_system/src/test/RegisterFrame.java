package test;

import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterFrame {
	static JFrame jf;
	static JTextField jt1 = new JTextField(15);// 静态成员变量 获取文本内容
	// static JTextField jt2 = new JTextField(15);
	static JPasswordField jt2 = new JPasswordField(15);
	static JTextField jt3 = new JTextField(15);
	static JTextField jt4 = new JTextField(15);

	static void showRegisterFrame() {

		jf = new JFrame("注册界面");
		// 2.Container
		Container c = new Container();
		// 3.设置容器布局
		c.setLayout(new GridLayout(5, 1));

		JPanel jp1 = new JPanel();
		JLabel j1 = new JLabel("用户名");
		// JTextField jt1 = new JTextField(15);
		// jt1.getText();
		jp1.add(j1);
		jp1.add(jt1);
		c.add(jp1);

		JPanel jp2 = new JPanel();
		JLabel j2 = new JLabel("密码");
		// JTextField jt2 = new JTextField(15);

		jp2.add(j2);
		jp2.add(jt2);
		c.add(jp2);

		JPanel jp3 = new JPanel();
		JLabel j3 = new JLabel("手机号");
		// JTextField jt3 = new JTextField(15);
		jp3.add(j3);
		jp3.add(jt3);
		c.add(jp3);

		JPanel jp4 = new JPanel();
		JLabel j4 = new JLabel("地址");
		// JTextField jt4 = new JTextField(15);
		jp4.add(j4);
		jp4.add(jt4);
		c.add(jp4);

		// Dimension dim = new Dimension(100, 30);// 设置按钮的显示内容
		JPanel jp5 = new JPanel();
		JButton j5 = new JButton("注册");
		// j5.setSize(dim); // 设置按钮的大小
		jp5.add(j5);
		c.add(jp5); /// c.add(j5);button比例大
		j5.addActionListener(new RegisterLister());
		jf.add(c);
		jf.setSize(500, 300);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);// 窗口居中
	}

}

/**
 * @author regex 1.实现监听接口
 */
class RegisterLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = RegisterFrame.jt1.getText();// 获取用户在用户名文本框输入的内容
		String password = String.valueOf(RegisterFrame.jt2.getPassword());// 返回字符数组 但接受的是字符串
		String phone = RegisterFrame.jt3.getText();//
		String address = RegisterFrame.jt4.getText();//

		JFrame jf = new JFrame();
		// String message = name + " " + password + " " + phone + " " + address;
		int flag = Web.Register(name, password, phone, address);
		if (flag == 1) {
			JOptionPane.showMessageDialog(jf, "注册成功", "提示", JOptionPane.CANCEL_OPTION);
			RegisterFrame.jf.dispose();// 注册界面销毁
			LoginFrame.showLoginFrame();// 跳转登录界面
		}

		else {
			JOptionPane.showMessageDialog(jf, "注册失败", "提示", JOptionPane.CANCEL_OPTION);
		}
	}

}
