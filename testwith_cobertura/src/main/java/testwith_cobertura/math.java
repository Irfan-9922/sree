/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package testwith_cobertura;

/**
 * @author :IRFAN
 *TIME:6:19:15 pm
 * DATE:05-Jun-2017
 *PROJECTNAME:testwith_cobertura
 */
public class math {
	public int sum(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int div(int a,int b){
		return a/b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public static void main(String[] args) {
		math m=new math();
System.out.println(m.sum(5, 5));
System.out.println(m.sub(5, 5));
System.out.println(m.div(10, 2));
System.out.println(m.mul(12, 8));
	}
	

}
