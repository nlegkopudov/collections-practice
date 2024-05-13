import resources.test_data.Collections;
import resources.test_objects.TestObject_1;

import java.util.ArrayList;
import java.util.List;

import static processing.Collections.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "----- Пример использования метода, возвращающего из коллекции только уникальные значения -----\n" +
                "Коллекция не уникальных значений:");

        var nonUniqueCollection = Collections.TEST_ARRAY_LIST_STRINGS;
        nonUniqueCollection.forEach(element -> System.out.print("\"" + element + "\" "));

        System.out.println("\nКоллекция уникальных:");

        var onlyUniqueValues = returnUniqueValues(nonUniqueCollection);
        onlyUniqueValues.forEach(element -> System.out.print("\"" + element + "\" "));
        System.out.println("\n");


        System.out.println(
                "----- Пример использования метода, возвращающего наибольшее значение -----\n" +
                "Коллекция чисел:");

        var numbersCollection = Collections.TEST_HASH_SET_INTEGERS;
        numbersCollection.forEach(element -> System.out.print(element + " "));

        System.out.println("\nНаибольшее значение: " + returnMaxValue(numbersCollection) + "\n");


        System.out.println(
                "----- Пример использования метода, возвращающего мапу из коллекции объектов -----\n");
        var collection_obj = Collections.OBJECT_ARRAY_LIST;
        var map_objects = createMapFromCollection(collection_obj);

        TestObject_1 object;
        for(int key : map_objects.keySet()){
            object = (TestObject_1) map_objects.get(key);
            System.out.print("Id = " + key + " :");
            object.printObjectFields();
        }

        System.out.println(
                "----- Примеры фильтрации -----\n" +
                        "До фильтрации:");
        ArrayList<String> collectionStrings = Collections.TEST_ARRAY_LIST_STRINGS;
        collectionStrings.forEach(str -> System.out.print("\"" + str + "\" "));
        System.out.println("\nПосле фильтрации:");
        List<String> filteredStrings = collectionStrings.stream().filter(str -> str.startsWith("A")).toList();
        filteredStrings.forEach(str -> System.out.print("\"" + str + "\" "));
        System.out.println();
    }
}