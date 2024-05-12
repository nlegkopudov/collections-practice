package processing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Collections {
    public static <T> Set<T> returnOnlyUniqValues(Collection<T> collection){
        return new HashSet<>(collection);
    }

    public static <I> I returnBiggestValue(Collection<I> collection){
        return collection.stream().sorted().findFirst().get();
    }

    public static <K> HashMap<K, Object> returnMapFromCollection(Collection<Object> collection, Class<?> className) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String methodNameGetId = "getId";
        Method getNameMethod = className.getMethod(methodNameGetId);
        K key;
        HashMap<K, Object> resultMap;
        resultMap = new HashMap<>();
        for(Object obj : collection){
            if(obj.getClass() == className){
                key = (K) getNameMethod.invoke(obj);
                resultMap.put(key, obj);
            }
        }
        return resultMap;
    }
}
