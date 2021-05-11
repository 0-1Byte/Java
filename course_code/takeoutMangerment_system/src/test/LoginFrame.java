package test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	static JFrame jf;// 顶层框架
	static JTextField jt1 = new JTextField(15);
	static JPasswordField jt2 = new JPasswordField(15);

	static void showLoginFrame() {
		jf = new JFrame("登录界面");
		Container c = new Container();
		c.setLayout(new GridLayout(5, 5));

		JPanel jp1 = new JPanel();
		JLabel j1 = new JLabel("用户名");
		jp1.add(j1);
		jp1.add(jt1);
		c.add(jp1);

		JPanel jp2 = new JPanel();
		JLabel j2 = new JLabel("密码");
		jp2.add(j2);
		jp2.add(jt2);
		c.add(jp2);

		JPanel jp5 = new JPanel();
		JButton login = new JButton("登录");
		jp5.add(login);
		c.add(jp5);
		login.addActionListener(new LoginButton());

		JPanel jp6 = new JPanel();
		JButton register = new JButton("注册");
		jp6.add(register);
		register.addActionListener(new RegisterButton());
		c.add(jp6);
		jf.add(c);

		jf.setSize(500, 300);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);// 窗口居中

	}
}

/**
 * 注册按钮监听事件
 * @author regex
 *
 */
class RegisterButton implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		//LoginFrame.jf.setVisible(false);// 登陆界面消失
		LoginFrame.jf.dispose();// 登陆界面销毁
		RegisterFrame.showRegisterFrame();//展示注册界面
	}
}
/**
 * 登录按钮监听事件
 * @author regex
 *
 */
class LoginButton implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = LoginFrame.jt1.getText();// 获取用户在用户名文本框输入的内容
		// String password = LoginFrame.jt2.getText();//
		String password = String.valueOf(RegisterFrame.jt2.getPassword());// 返回字符数组 但接受的是字符串
     	JFrame jf = new JFrame();
		int flag=Web.login(name, password);//return   -1用户名不存在 0 用户名密码不匹配 1登录成功
		if(flag==-1) {
			JOptionPane.showMessageDialog(jf, "用户名不存在，请重新输入", "提示", JOptionPane.NO_OPTION);
		}
		else if(flag==0) {  //???
			JOptionPane.showMessageDialog(jf, "用户名密码不匹配", "提示", JOptionPane.NO_OPTION);
		}
		else if(flag==1) {
			LoginFrame.jf.dispose();
			BuyMainFrame.showBuyMainFrame();
		}
	}
}

