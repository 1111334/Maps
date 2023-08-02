import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        HashMap<Integer, String> numberEnglish = new HashMap<>();
        numberEnglish.put(1, "one");
        numberEnglish.put(2, "two");
        numberEnglish.put(3, "three");
        numberEnglish.put(4, "four");
        numberEnglish.put(5, "five");


        HashMap<Integer, String > numeriItaliani = new HashMap<>();
        numeriItaliani.put(1, "uno");
        numeriItaliani.put(3, "tre");
        numeriItaliani.put(5, "cinque");
        numeriItaliani.put(7, "sette");
        numeriItaliani.put(9, "nove");

        numberEnglish.putAll(numeriItaliani);

        System.out.println("Hashmap modificata");
        for (Integer key : numberEnglish.keySet()) {
            System.out.println(key + ": " + numberEnglish.get(key));
        }

        printValueForKey(numberEnglish, 5);
        printValueForKey(numberEnglish, 6);
        printValueForKey(numberEnglish, 7);
        printValueForKey(numberEnglish, 8);
        printValueForKey(numberEnglish, 9);
    }

    // Metodo per stampare il valore di una chiave
    public static void printValueForKey(HashMap<Integer, String> map, int key) {
        String value = map.getOrDefault(key, "No associated value");
        System.out.println("Chiave " + key + ": " + value);

    }




}
