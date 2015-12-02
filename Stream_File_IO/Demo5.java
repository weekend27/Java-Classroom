/*
上面的程序首先创建文件test.txt，并把给定的数字以二进制形式写进该文件，同时输出到控制台上。
以上代码由于是二进制写入，可能存在乱码，你可以使用以下代码实例来解决乱码问题：
*/

import java.io.*;

public class Demo5{
  public static void main(String[] args) throws IOException{
    File f = new File("newtest.txt");
    // 构建FileOutputStream对象,文件不存在会自动新建
    FileOutputStream fop = new FileOutputStream(f);
    // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
    OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

    writer.append("中文输入");
    writer.append("\r\n");
    writer.append("English");
    writer.close();
    fop.close();

    // 构建FileInputStream对象
    FileInputStream fip = new FileInputStream(f);

    // 构建InputStreamReader对象,编码与写入相同
		InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

		StringBuffer sb = new StringBuffer();
		while (reader.ready()) {
			sb.append((char) reader.read());
			// 转成char加到StringBuffer对象中
		}
		System.out.println(sb.toString());
    // 关闭读取流
		reader.close();

		// 关闭输入流,释放系统资源
		fip.close();
  }
}
