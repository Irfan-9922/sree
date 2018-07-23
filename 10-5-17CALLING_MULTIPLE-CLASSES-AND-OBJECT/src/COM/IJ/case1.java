/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package COM.IJ;

/**
 * @author :IRFAN
 *TIME:4:29:12 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17CALLING_MULTIPLE-CLASSES-AND-OBJECT
 */
//when setting values to obj it will start from bottom to top mins first you have to set chiled obj value first and 
//then parent object

public class case1 {
	/**
	 *       top to bottom
	 * class A----------  (3) set value third here
	 *                 |
	 *                 |
	 *                 class B---------- (2) set value second here
	 *                                 |
	 *                                 |
	 *                                 |
	 *                                 class C     (1)set value first here
	 *                 
	 *                 
	 *                 
	 *        when getting the value from object first cheack proper null cheks
	 *        while getting data from obj start from top to bottom
	 *        
	 *        
	 */
	public static void main(String[] args) {
		adress a=new adress();
		a.setCity("latur");
		a.setCountry("india");
		a.setState("maharastra");
		a.setStreet("masjid road");
		student s=new student();
		
		
		System.out.println("hello");
		s.setId(12);
		s.setName("irfan");
		
		s.setAdress(a);
		
		//System.out.println(s.getId());
		s.getName();
		s.getAdress().getCity();
		s.getAdress().getCountry();
		s.getAdress().getState();
		s.getAdress().getStreet();
		System.out.println(s);
		//System.out.println(a);
		
		
		
	}
	

}
