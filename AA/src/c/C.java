/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package c;

/**
 * @author :IRFAN
 *TIME:11:25:43 am
 * DATE:11-May-2017
 *PROJECTNAME:AA
 */
public class C {
	public Cresp cresp(Creq creq){
		System.out.println("inside c class"+creq);
		Cresp c=new Cresp();
		c.setRespmsg("deliverd");
		c.setStatus("nice");
		return c;
		
	}

}
