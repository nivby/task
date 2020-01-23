package greet;

import java.time.LocalDateTime;
import java.util.*;

public class GreetSystem {

    private Set<Greeter> greeters;
    private GreetTask task;
    private Thread greetThread;

    public GreetSystem(){
        greeters = new HashSet<>();
        greeters.add(new Greeter(
                LocalDateTime.of(1994,12,19,22, 2),
                "Happy Birth day Niv",
                true,
                false
        ));
        greeters.add(new Greeter(
                LocalDateTime.of(1996,05,28,13,56)
                ,"Happy birth day for Shai",
                false,
                true
        ));
        greeters.add(new Greeter(LocalDateTime.of(2003,8,11,17,33)
        ,"Happy biirth day to AVI blabla",
                true,
                true));

        greeters.add(new Greeter(LocalDateTime.of(1974,4,23,51, 7)
        ,"welcome and Happy birth Date to Yossi",
                false,
                false));
        task = new GreetTask(greeters);
        greetThread = new Thread(task);
        greetThread.setDaemon(true);
    }

    public List<Greeter> getGreeters(){
        List<Greeter> greeters1 = new ArrayList<>();
        for (Greeter current:greeters) {
            greeters1.add(current);
        }
        Collections.sort(greeters1);
        return greeters1;

    }


    public boolean addGreeter(Greeter toAdd) {
       return greeters.add(toAdd);
    }



}
