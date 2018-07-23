/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package temp;

/**
 * @author :IRFAN
 *TIME:5:46:35 pm
 * DATE:10-May-2017
 *PROJECTNAME:nil
 */
public class case1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adress a=new Adress();
		a.setCity("latuer");
        a.setCountery("india");
        a.setState("maharastar");
        a.setStreet("masjid road");
        student s=new student();
        s.setId("123");
        s.setName("irfan");
		// student s=new student();
        s.setAdress(a);
        //while getting data from top to bottom
        if(a!=null && s.getAdress()!=null){
        s.getAdress();
        s.getId();
        s.getName();
        System.out.println(s);
        }
        else{
        	System.out.println("please enter data into obj");
        }
        
	}

}
