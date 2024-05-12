package processing;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Collections {
    public static <T> Set<T> returnOnlyUniqValues(Collection<T> collection){
        return new HashSet<>(collection);
    }
}
