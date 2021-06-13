/*
【问题描述】
输入两行字符串s和t（s和t最长含50个字符，可以含有空格），将s串中首次与t匹配的子串逆置，并将结果输出。
【输入文件】
输入文件为invertsub.in，含有两行字符串s和t，分别以＃作为串结束符。

【输出文件】
输出文件invertsub.out只有一行，包含一个串，是要求的输出结果。在行末也要有一个回车符。

【输入样例】
helloworld＃
llowor＃

【输出样例】
herowollld

【样例说明】
helloworld和llowor中重复的子串为llowor，逆置后结果为herowollld
*/
package week15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		String filename = "invertsub.in";
		List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
		// lines.forEach(System.out::println);
		String[] str = lines.toArray(new String[lines.size()]);
//	    for(String s : str) {  
//	         System.out.println(s);  
//	    }  	
		String a = str[0].toString();
		String b = str[1].toString();

		a = a.substring(0, a.length() - 1);
		b = b.substring(0, b.length() - 1);

		int pos = a.indexOf(b);
		a = reverseSub(a, pos, b.length() + pos - 1);
		//System.out.println(a);		
		a = a + System.getProperty("line.separator");
		byte[] date = a.getBytes("UTF-8");
		File W = new File("invertsub.out");
		OutputStream os = new FileOutputStream(W);
		os.write(date);
		os.close();

	}

	static String reverseSub(String str, int start, int end) {
		String b = "";
		char[] c = str.toCharArray();
		int i = start, j = end;
		while (i <= (start + end) / 2) {
			char ch = c[i];
			c[i] = c[j];
			c[j] = ch;
			i++;
			j--;
		}
		for (int k = 0; k <= c.length - 1; k++) {
			b = b + c[k];
		}
		return b;
	}
}
