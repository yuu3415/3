package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("メッシ");
        names.add("クリロナ");
        names.add(null);
        names.add("イニエスタ");

        System.out.println(names);
        System.out.println(names.toArray().length);


        Map<String, String> userMap = new HashMap<>();
        userMap.put("マリエ", "とてもうるさいです");
        userMap.put(null, null);
        userMap.put("りさこ", "・・・");
        userMap.remove("りさこ");


        System.out.println(userMap);


        List<String> dogs = new ArrayList<>();
        dogs.add("しろ");
        dogs.add(null);
        dogs.add("はな");

        System.out.println(dogs);
        System.out.println(dogs.toArray().length);

        String name5 = null;
        if (name5 == null) {
            System.out.println("ここは空です");
        }
        Optional<String> value = Optional.ofNullable(name5);
        System.out.println(value.or(() -> Optional.of("空です")).get());

        System.out.println(name5.length());

    }

}
