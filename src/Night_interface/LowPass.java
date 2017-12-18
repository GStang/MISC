package Night_interface;

/**
 * Created by DELL on 2017/1/5.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;}

    public Waveform process(Waveform input){
        return input;
    }
}
