package Night_interface;

/**
 * Created by DELL on 2017/1/5.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){
        return input;}

}
