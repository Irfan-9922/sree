import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		user u=new user();
		u.setName("irfan");
		u.setAccno(1212);
		u.setPassword(232323);
		u.setUsername("irfan");
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("bank.ser"));
		os.writeObject(u);
		System.out.println("data is written");

	}

}
