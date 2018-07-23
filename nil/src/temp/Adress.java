/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package temp;

/**
 * @author :IRFAN
 *TIME:5:44:44 pm
 * DATE:10-May-2017
 *PROJECTNAME:nil
 */
public class Adress {
	private String city;
	private String countery;
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
	 * @return the countery
	 */
	public String getCountery() {
		return countery;
	}
	/**
	 * @param countery the countery to set
	 */
	public void setCountery(String countery) {
		this.countery = countery;
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
		return "Adress [city=" + city + ", countery=" + countery + ", state=" + state + ", street=" + street + "]";
	}
	

}
