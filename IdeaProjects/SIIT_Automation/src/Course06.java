import java.lang.reflect.Array;
import java.util.*;

public class Course06 {

    public static HashSet getUniqueWords(String phrase) {
        HashSet<String> uniqueWords = new HashSet<>();
        String[] words = phrase.split(" ");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase(Locale.ROOT));
        }
        return uniqueWords;
    }

    public static HashMap<Character, Integer> getAllCharsCount (String phrase) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (Character c : phrase.toLowerCase(Locale.ROOT).toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.replace(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        return charMap;
    }

    public static void printHashMap(HashMap<Character, Integer> hm) {
        for (Character c : hm.keySet()) {
            System.out.println(c + " : " + hm.get(c));
        }
    }

    public static void main(String[] args) {

        int[] arrayInt = {1, 5, 9};
        String[] arrayString = {"Alex", "are", "mere"};


        ArrayList arr2 = new ArrayList();
        List arr3 = new ArrayList();
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Andreea");
        names.add("Bianca");
        System.out.print(names.size());
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Andrei");
        ArrayList<String> name3 = new ArrayList<>();
        name3.addAll(names);
        name3.addAll(names2);
        ArrayList<String> names4 = (ArrayList<String>)name3.clone();
        if (name3.contains("Alex")) {
            System.out.println("Alex is part of the team");
        } else {
            System.out.println("Alex is not part of the team");
        }

        System.out.println(name3.indexOf("Alex"));
        System.out.println(name3.get(0));
        name3.set(0, "AALEX");
        System.out.println(name3.get(0));

        Iterator it = name3.iterator();
        while ((it.hasNext())) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Alex");
        myHashSet.add("Andreea");
        myHashSet.add("Alex");

        for (String s : myHashSet) {
            System.out.print(s + " ");
        }

        System.out.println();

        String phrase = "Ana are mere are pere";

        for (Object word : getUniqueWords(phrase)) {
            System.out.println(word);
        }

        HashMap<Integer, String> namesIndex = new HashMap<>();
        namesIndex.put(10, "Alex");
        namesIndex.put(5, "Andreea");

        System.out.println();

        for (Integer key : namesIndex.keySet()) {
            System.out.println(key + " : " + namesIndex.get(key));
        }

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        hashMap1 = getAllCharsCount("ana are mere");

        printHashMap(hashMap1);

        System.out.println();

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(56);
        q.add(101);
        q.add(69);
        q.add(23);
        System.out.println(q);
        int qhead = q.remove();
        System.out.println(qhead);
        System.out.println(q);

        System.out.println(Browsers.FIREFOX);

    }
}
