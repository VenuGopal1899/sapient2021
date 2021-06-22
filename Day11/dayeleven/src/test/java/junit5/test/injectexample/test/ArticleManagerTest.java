/**
 * 
 */
package junit5.test.injectexample.test;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import junit5.ArticleDatabase;
import junit5.ArticleListener;
import junit5.ArticleManager;
import junit5.User;

/**
 * @author admi
 *
 */
public class ArticleManagerTest {
	 @Mock ArticleDatabase database;
	    @Mock User user;

	    @InjectMocks
	    private ArticleManager manager; //creates an instance of ArticleManager and injects the mocks into it


	    @Test public void shouldDoSomething() {
	       // calls addListener with an instance of ArticleListener
	       manager.initialize();

	        // validate that addListener was called
	       Mockito.verify(database).addListener(Mockito.any(ArticleListener.class));
	    }

}
