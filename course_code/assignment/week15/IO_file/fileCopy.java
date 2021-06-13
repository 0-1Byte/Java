/*
【问题描述】
编写一个程序，实现文件的复制。程序的任务是将当前目录下filecopy.in文件复制成filecopy.out

【输入文件】
输入文件为当前目录下的filecopy.in。其内容由任意文本构成。

【输出文件】
输出文件为当前目录下的filecopy.out。

【样例输入】
若输入filecopy.in文件内容如下：
hello world1!#
hello world2!#
hello world3!#
hello world4!#

【样例输出】
输出文件filecopy.out内容为：
hello world1!#
hello world2!#
hello world3!#
hello world4!#

【样例说明】
输入文件为当前目录下的filecopy.in，输出文件为当前目录下的filecopy.out。
*/
//method1
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws IOException {
		byte[] data = new byte[1000];
		// 读取
		File f = new File("filecopy.in");
		InputStream in = new FileInputStream(f);
		int n = in.read(data, 0, 1000);
		in.close();
		// 将前N个字节转换成字符串
		String s = new String(data, 0, n, "utf-8");
	
		// 写入
		byte  []date=s.getBytes("UTF-8");		
		File W=new File("filecopy.out");	
		OutputStream os=new FileOutputStream(W);
		os.write(date);
		os.close();
	}
}


//method2
import java.io.File;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        BufferedWriter bw=null;
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader("filecopy.in"));
            bw=new BufferedWriter(new FileWriter("filecopy.out"));
            String line=System.getProperty("line.separator");
            String output=null;
            while((output=br.readLine())!=null){
                bw.write(output+line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            br=new BufferedReader(new FileReader("filecopy.out"));
            String output=null;
            while((output=br.readLine())!=null){
                System.out.println(output);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


