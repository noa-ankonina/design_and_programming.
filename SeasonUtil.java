import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        // TODO: Implement.
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        // TODO: Implement.
        String my="";
        for (Seasonable i : seasonables) {
           my+= i.toString()+"\n";
        }
        return my;
    }
}
