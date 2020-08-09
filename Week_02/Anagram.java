package week02;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(new Anagram().solution2(s, t));
    }

    public boolean solution1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(s.length());
        for (Character ch : s.toCharArray()
        ) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Character ch : t.toCharArray()
        ) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        for (Integer val : map.values()
        ) {
            if (val > 0) {
                return false;
            }
        }
        return true;

    }

    public boolean solution2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (Character ch : s.toCharArray()
        ) {
            arr[ch - 'a']++;
        }

        for (Character ch : t.toCharArray()
        ) {
            arr[ch - 'a']--;
        }
        for (Integer i : arr
        ) {
            if (i > 0) {
                return false;
            }
        }
        return true;

    }
}
