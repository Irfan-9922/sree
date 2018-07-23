/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package first;

import second.BB;
import second.BBreq;
import second.BBresp;

/**
 * @author :IRFAN
 *TIME:5:31:26 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderfinaldemo
 */
public class AA {
	public AAres m1(AAreq re){
		/*BBreq d=new BBreq();
		d.setAccno(re.getAccno());
		d.setPass(re.getPass());*/
		Abuilder b=new Abuilder();
		BBreq v=b.m1(re);
		
		
		BB bom=new BB();
		BBresp f=bom.m1(v);
		Abuilderres ww=new Abuilderres();
		AAres g=ww.m1(f);
		/*AAres pp=new AAres();
		 pp.setBalance(f.getBalance());
		 pp.setExpdate(f.getExpdate());*/
		
		return g;
	}
	public static void main(String[] args) {
		AA c=new AA();
		AAreq m=new AAreq();
		m.setAccno("12322");
		m.setPass("333");
		System.out.println(c.m1(m));
	}

}
