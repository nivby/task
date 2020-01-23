package greet;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class GreetTask implements Runnable  {

    private Set<Greeter> greeters = new HashSet<>();

    public GreetTask(Set<Greeter> greeters) {
        this.greeters = greeters;
    }

    @Override
    public void run() {

        LocalDateTime now = LocalDateTime.now();
        while (true){
        for (Greeter greeter:greeters) {
            if (greeter.getBirthDate().getMonth().equals(now.getMonth()) && !greeter.getSeen()){
                System.out.println(greeter.getMessage());
                greeter.setSeen(true);
            }
        }
    }
    }
}