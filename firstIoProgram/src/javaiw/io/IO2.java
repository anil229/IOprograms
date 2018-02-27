package javaiw.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO2 {

	public static void main(String[] args) {
		try {
			long l1=System.currentTimeMillis();
			FileInputStream is=new FileInputStream("a:/xyz.jpg");
			BufferedInputStream bis=new  BufferedInputStream(is);
			FileOutputStream os=new FileOutputStream("b:/vishal.jpg");
			BufferedOutputStream bos=new BufferedOutputStream(os);
			int x;
			while((x=bis.read())!=-1){
				bos.write(x);
			}
			bos.flush();bos.close();
			bis.close();
			long l2=System.currentTimeMillis();
			System.out.println("Time taken is "+(l2-l1)/1000.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
