import resources.test_data.Collections;
import resources.test_objects.TestObject_1;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static processing.Collections.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for(Object str : Collections.TEST_ARRAY_LIST_STRINGS){
            System.out.println(str);
        }

        Set<String> result = returnOnlyUniqValues(Collections.TEST_ARRAY_LIST_STRINGS);

        for(String str : result){
            System.out.println(str);
        }

//        long result2 = returnBiggestValue(Collections.TEST_HASH_SET_INTEGERS);
//        long result3 = returnBiggestValue(Collections.TEST_HASH_SET_LONGS);
//        long result4 = returnBiggestValue(Collections.TEST_HASH_SET_SHORTS);

        var testObject = new TestObject_1("001", "Some data", 10);

        Collection<Object> objCollection = new ArrayList<>();

        objCollection.add(testObject);

        HashMap<Object, Object> result_map = returnMapFromCollection(objCollection, TestObject_1.class);

        System.out.println(result_map.get("001").getId());

        System.out.println("Hi its me and we already finished.");
    }
}