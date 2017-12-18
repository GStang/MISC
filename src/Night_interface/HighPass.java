package Night_interface;

/**
 * Created by DELL on 2017/1/5.
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
