package annotations;

import com.sun.corba.se.spi.ior.Writeable;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by DELL on 2017/2/15.
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UesCase uc = m.getAnnotation(UesCase.class);
            if (uc != null){
                System.out.println("Found Use Case:" + uc.id() + " " +
                        "" + uc.description());
                useCases.remove(new Integer(uc.id()));

            }
        }
        for (int i : useCases) {
            System.out.println("Warning:Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtils.class);
    }
}
