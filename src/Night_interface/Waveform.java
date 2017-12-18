package Night_interface;

/**
 * Created by DELL on 2017/1/5.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform"+id;
    }
}
