/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package COM.IJ;

/**
 * @author :IRFAN
 *TIME:4:30:11 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17CALLING_MULTIPLE-CLASSES-AND-OBJECT
 */
public class student {
	private String name;
	private int id;
	private adress adress;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the adress
	 */
	public adress getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(adress adress) {
		this.adress = adress;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}

}
