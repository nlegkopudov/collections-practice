import test_data.Collections;

import java.util.Set;

import static processing.Collections.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

        System.out.println("Hi its me and we already finished.");
    }
}