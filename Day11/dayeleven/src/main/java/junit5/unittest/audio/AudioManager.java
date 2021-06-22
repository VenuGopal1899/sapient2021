/**
 * 
 */
package junit5.unittest.audio;

/**
 * @author admi
 *
 */
public class AudioManager {
	private int volume = 50;
    private RINGERMODE mode = RINGERMODE.RINGER_MODE_SILENT;

    public RINGERMODE getRingerMode() {
        return mode;
    }
    public int getStreamMaxVolume() {
        return volume;
    }
    public void setStreamVolume(int max) {
        volume = max;
    }
    public void makeReallyLoad() {
        if (mode.equals(RINGERMODE.RINGER_MODE_NORMAL)) {
            setStreamVolume(100);
        }
    }
}
