/**
 * 
 */
package springbeancontextexample.app;

import java.util.Locale;

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
		//Member member3 =  (Member)context.getBean("member3");
		
		System.out.println(member1);
		//System.out.println(member2);
		//System.out.println(member3);
		
		
		// Using ResourceBundle trying to read properties for internationalization
		String message = context.getMessage("member.name", null, Locale.US);
		String messagefr = context.getMessage("member.name", null, Locale.FRANCE);
		System.out.println(messagefr);
        System.out.println(message);
        
        //Using PropertyPlaceHolderConfigurer
        //System.out.println(member2.displayMessage());
        member2.displayMessage();

	

		

	}

}
