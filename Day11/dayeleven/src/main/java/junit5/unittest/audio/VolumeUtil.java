/**
 * 
 */
package junit5.unittest.audio;

/**
 * @author admi
 *
 */
public class VolumeUtil {

	public static void maximizeVolume(AudioManager audioManager) {
        if (audioManager.getRingerMode() != RINGERMODE.RINGER_MODE_SILENT) {
            int max = audioManager.getStreamMaxVolume();
            audioManager.setStreamVolume(max);
        }
    }
}
