package javaiw.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) {
		Student s1=new Student(1,"vishal",23,234);
		Student s2=new Student(2,"vishali",21,221);
		try {
			FileOutputStream fos=new FileOutputStream("a:/objects.out");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(s1);
			os.writeObject(s2);
			os.flush();os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
