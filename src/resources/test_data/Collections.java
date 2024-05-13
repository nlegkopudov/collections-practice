package resources.test_data;

import resources.test_objects.TestObject_1;

import java.util.*;

public class Collections {
    public static final ArrayList<String> TEST_ARRAY_LIST_STRINGS = new ArrayList<>(Arrays.asList(
            "Element 03", "Element 02", "Element 01", "Another element", "Another element", "The last"
    ));

    public static final ArrayList<Integer> TEST_ARRAY_LIST_INTEGERS = new ArrayList<>(Arrays.asList(
            21, 22, 11, 58, 88, 5, 5, 11, 22
    ));

    public static final HashSet<Integer> TEST_HASH_SET_INTEGERS = new HashSet<>(Set.of(1, 2, 3, 4, 5));

    public static final ArrayList<Object> OBJECT_ARRAY_LIST = new ArrayList<>(Arrays.asList(
            new TestObject_1("First", "Some data", 31),
            new TestObject_1("Second", "Some another data", 729),
            new TestObject_1("Third", "And some another data", 7)
    ));
}
