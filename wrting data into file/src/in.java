import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class in {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("bank.ser"));
       user u=(user) oi.readObject();
       System.out.println(u.getAccno());
       System.out.println(u.getPassword());
	}

}
