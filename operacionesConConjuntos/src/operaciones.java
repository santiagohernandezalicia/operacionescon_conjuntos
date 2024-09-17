import java.util.HashSet;
import java.util.Set;
public class operaciones {

    public static Set<String> union(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static Set<String> intersect(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static Set<String> diff(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public static boolean isSubset(Set<String> a, Set<String> b) {
        return a.containsAll(b);
    }

    public static Set<String> cartesiano(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>();
        for (String x : a) {
            for (String y : b) {
                result.add("(" + x + ", " + y + ")");
            }
        }
        return result;
    }
}
