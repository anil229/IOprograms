package javaiw.io;

import java.io.File;

public class IoFile {
	public static void main(String[] args) {
		File file=new File("a:/aspect");//pwd is d:/study/java/javase       path is ../../oracle/sql   d:/study/oracle/sql
		System.out.println(file.isFile());
		String s[]=file.list();
		for(String s1:s){
			System.out.println(s1);
		}
	}
}
