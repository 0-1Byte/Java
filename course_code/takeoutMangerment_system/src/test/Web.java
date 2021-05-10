package test;

/**
 * 网站类
 * 
 * @author regex
 *
 */
public class Web {
	// String webName;// 网站名
	static User[] user = new User[10000]; // User[] user;
	static int userNumber;// 当前网站已经注册用户数
	// static 所有界面共享信息

	/**
	 * @param userName
	 * @param passWord
	 * @param phoneNumber
	 * @param adress
	 * @return 1 注冊成功 0 注册失败（用户名 手机号重复）
	 */
	static int Register(String userName, String passWord, String phoneNumber, String address) {
		for (int i = 0; i < userNumber; i++) {
			if (user[i].userName.equals(userName)) {
				return 0;
			}
		}
		user[userNumber] = new User(userName, passWord, phoneNumber, address);
		userNumber++;
		return 1;
	}

	/**
	 * 登陆方法-判断用户输入的用户名和密码是否匹配
	 * @param userName
	 * @param passWord
	 * @return   -1用户名不存在 0 用户名密码不匹配 1登录成功
	 */
	static int login(String userName, String passWord) {
		for (int i = 0; i < userNumber; i++) {
			if (user[i].userName.equals(userName)) { //网站存在用户
				if(user[i].passWord.equals(passWord)) {
					return 1;
				}	
			else return 0;
			}	
		}
		return -1;
	}
	
	
}
