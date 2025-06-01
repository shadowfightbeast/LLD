package MultiThreading;

import java.util.*;

public class CollectionsM {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(1000);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(0, 0);

        a.remove(1);
        a.remove(Integer.valueOf(2));
        System.out.println(a);
        System.out.println(a.size());

        List<String> b = Arrays.asList("a", "b");
        // b.add("c");//you cannot add data in asList you can just replace the existing
        // data.
        b.set(1, "c");
        List<String> c = List.of("a", "b");
        System.out.println(c);

    }
}
