package org.example.Hash;

// S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
// 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
//ex) bacaAacba 와 abc 가 주어지면 {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.

import java.util.HashMap;

public class example3 {
    public int soltion(String s, String t) {
        int answer = 0;
        //t에 관해서 넣어놓을 해쉬맵 bm,과 비교하기위한 am배열
        HashMap<Character, Integer> bm = new HashMap<>();
        HashMap<Character, Integer> am = new HashMap<>();
        for (char c : t.toCharArray()) {
            bm.put(c, bm.getOrDefault(c, 0) + 1);
        }

        int L = t.length() - 1;
        for (int i = 0; i < L; i++) {
            am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = L; rt < s.length(); rt++) {
            am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0) + 1);
            if (am.equals(bm)) answer++;
            am.put(s.charAt(lt), am.get(s.charAt(lt)) - 1);
            if (am.get(s.charAt(lt)) == 0) am.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }

}
