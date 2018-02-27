package javaiw.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IO3 {
	public static void main(String[] args) {
		try {
			long l1=System.currentTimeMillis();
			FileReader is=new FileReader("a:/xyz.txt");
			BufferedReader br=new  BufferedReader(is);
			FileWriter fw=new FileWriter("b:/vishal2.txt");
			PrintWriter bw=new PrintWriter(fw);
			String str;
			while((str=br.readLine())!=null){
				bw.println(str);
			}
			bw.flush();bw.close();
			br.close();
			long l2=System.currentTimeMillis();
			System.out.println("Time taken is "+(l2-l1)/1000.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
