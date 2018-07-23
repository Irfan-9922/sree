/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package COM.IJ;

/**
 * @author :IRFAN
 *TIME:4:32:35 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17CALLING_MULTIPLE-CLASSES-AND-OBJECT
 */
public class adress {
	private String city;
	private String country;
	private String state;
	private String street;
	/**
	 * @return the city
	 */
	
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		System.out.println("hello3333");
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "adress [city=" + city + ", country=" + country + ", state=" + state + ", street=" + street + "]";
	}

}
