import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		details d=new details();
		Map<String,Object>m=new HashMap<String,Object>();
		d.setCustomer(1);
		d.setName("irfan");
		d.setDob(12);
		d.setCdno(12323);
		d.setCvvno(23223);
		d.setExp(12-3-20);
		d.setBal(20000);
		m.put("customerId",d.getCustomer());
		m.put("name", d.getName());
		m.put("dob", d.getDob());
		m.put("cdno", d.getCdno());
		m.put("cvvno", d.getCvvno());
		m.put("exp", d.getExp());
		m.put("bal", d.getBal());
		System.out.println(m);

		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("xx.txt"));
		os.writeObject(m);
		System.out.println("object writed");
	}

}
/*private int customer;
private String name;
private int dob;
private int cdno;
private int cvvno;
private int exp;
private int bal;
*/