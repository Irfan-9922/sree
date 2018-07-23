import java.io.Serializable;

public class user implements Serializable{
	private String name;
	@Override
	public String toString() {
		return "user [name=" + name + ", accno=" + accno + ", password=" + password + ", username=" + username + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private int accno;
	private int password;
	private String username;

}
