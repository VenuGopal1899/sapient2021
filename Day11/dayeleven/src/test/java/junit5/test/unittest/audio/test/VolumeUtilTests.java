/**
 * 
 */
package junit5.test.unittest.audio.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import junit5.unittest.audio.AudioManager;
import junit5.unittest.audio.RINGERMODE;
import junit5.unittest.audio.VolumeUtil;

/**
 * @author admi
 *
 */
public class VolumeUtilTests {

		@Test
	    public void testNormalRingerIsMaximized() {
		
			// 1.) mock AudioManager
			// 2.) configure Audiomanager to return RINGER_MODE_NORMAL if getRinderMode is
			// called
			// 3.) configure Audiomanager to return 100 if getStreamMaxVolume() is called
			// 4.) call VolumeUtil.maximizeVolume with Audiomanager -> code under test
			// 5.) verify that setStreamVolume(STREAM_RING, 100, 0) was called on
			// audioManager
	      // 1. Prepare mocks and script their behavior.
	      AudioManager audioManager = mock(AudioManager.class);
	      when(audioManager.getRingerMode()).thenReturn(RINGERMODE.RINGER_MODE_NORMAL);
	      when(audioManager.getStreamMaxVolume()).thenReturn(100);

	      // 2. Test the code of interest.

	      VolumeUtil.maximizeVolume(audioManager);
 
	      // 3. Validate that we saw exactly what we wanted.
	      verify(audioManager).setStreamVolume(100);
	    }

		
	    @Test
	    public void testSilentRingerIsNotDisturbed() {
	    	// 1. Prepare AudioManager mock
			// 2.) configure audiomanager to return "RINGER_MODE_SILENT" if getRingerMode is
			// called
			// 3.) call VolumeUtil.maximizeVolume with audio manager
			// 4.) verify that getRingerMode()
			// 5.) Ensure that nothing more was called
	    	
	          // 1. Prepare mocks and script their behavior.
	          AudioManager audioManager = mock(AudioManager.class);
	          when(audioManager.getRingerMode()).thenReturn(RINGERMODE.RINGER_MODE_SILENT);
	          // 2. Test the code of interest.
	          VolumeUtil.maximizeVolume(audioManager);
	          // 3. Validate that we saw exactly what we wanted.
	          verify(audioManager).getRingerMode();
	          verifyNoMoreInteractions(audioManager);
	    }



}
