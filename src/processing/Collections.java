package processing;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Collections {
    public static <T> HashSet<T> returnUniqueValues(Collection<T> collection){
        return new HashSet<>(collection);
    }

    public static Integer returnMaxValue(Collection<Integer> collection){
        if(collection.isEmpty()){
            return 0;
        }
        return collection.stream().max(Integer::compareTo).get();
    }

    public static HashMap<Integer, Object> createMapFromCollection(Collection<Object> collection){
        HashMap<Integer, Object> result = new HashMap<>();
        int uid = 0;
        for(Object obj : collection){
            result.put(++uid, obj);
        }

        return result;
    }
}
