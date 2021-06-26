/**
 * 
 */
package springbeancontextexample.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springbeancontextexample.beans.Member;

/**
 * @author admi
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springconfig.xml");
		Member member1 =  (Member)context.getBean("member1");
		Member member2 =  (Member)context.getBean("member2");
		
		System.out.println(member1);
		System.out.println(member2);

		

	}

}
