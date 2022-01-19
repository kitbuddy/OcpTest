import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class BirdsList {

    List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3,4));
    List<Integer> fish = new CopyOnWriteArrayList<>(source);
    List<Integer> mammals = Collections.synchronizedList(source);
    /*birds = new ConcurrentSkipListSet<Integer>();
    birds.addAll*/
}
