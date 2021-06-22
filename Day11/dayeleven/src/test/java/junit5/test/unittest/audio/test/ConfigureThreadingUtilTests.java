/**
 * 
 */
package junit5.test.unittest.audio.test;


import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import junit5.unittest.audio.ConfigureThreadingUtil;
import junit5.unittest.audio.MyApplication;

/**
 * @author admi
 *
 */

@ExtendWith(MockitoExtension.class)
public class ConfigureThreadingUtilTests {
    @Test
    public void testApplication (@Mock MyApplication app){
        ConfigureThreadingUtil.configureThreadPool(app);
        verify(app).getNumberOfThreads();
        verifyNoMoreInteractions(app);
    }
}
