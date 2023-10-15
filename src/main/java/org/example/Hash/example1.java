package org.example.Hash;

import java.util.HashMap;

public class example1 {
    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map.size());

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
//System.out.print]n(key+" "+map.get (key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}