package ObserverPatternDemo;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternDemo {

    static class SachinObserverNotifier{

        List<Sachinfans> sachinFansList = new ArrayList<Sachinfans>();

        void register(Sachinfans sachinfans) {
            sachinFansList.add(sachinfans);
        }

        void SachinScoredCentury() {
            for (Sachinfans sachinFan: sachinFansList) {
                sachinFan.announce();
            }
        }
    }

    public static void main(String[] args) {
        SachinObserverNotifier sachinObserverNotifier = new SachinObserverNotifier();
        sachinObserverNotifier.register(new Sachinfans("Ranga"));
        sachinObserverNotifier.register(new Sachinfans("Reema"));
        sachinObserverNotifier.register(new Sachinfans("veena"));
        sachinObserverNotifier.SachinScoredCentury();
    }
}
