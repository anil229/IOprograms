package javaiw.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {
	public static void main(String[] args) {
		Student s1, s2;
		try {
			FileInputStream fos=new FileInputStream("a:/objects.out");
			ObjectInputStream is=new ObjectInputStream(fos);
			s1=(Student)is.readObject();
			s2=(Student)is.readObject();
			System.out.println(s1);
			System.out.println(s2);
			is.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
