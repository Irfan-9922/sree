/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package second;

import third.CC;
import third.CCreq;
import third.CCres;

/**
 * @author :IRFAN
 *TIME:5:32:38 pm
 * DATE:12-May-2017
 *PROJECTNAME:builderfinaldemo
 */
public class BB {
	public BBresp m1(BBreq re){
		System.out.println(re);
		CCreq c=new CCreq();
		c.setAccno(re.getAccno());
		c.setPass(re.getPass());
		CC b=new CC();
		CCres gg=b.m1(c);
		BB bn=new BB();
		BBresp p=new BBresp();
		p.setBalance(gg.getBalance());
		p.setExpdate(gg.getExpdate());
		return p;
		
	}

}
