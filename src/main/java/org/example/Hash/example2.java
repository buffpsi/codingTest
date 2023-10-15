package org.example.Hash;

import java.util.ArrayList;
import java.util.HashMap;

public class example2 {
    public ArrayList<Integer> solution(int n, int k, int arr[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> Hm = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            Hm.put(arr[i], Hm.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            Hm.put(arr[rt], Hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(Hm.size());
            Hm.put(arr[lt], Hm.get(arr[lt]) - 1);
            if (Hm.get(arr[lt]) == 0) {
                Hm.remove(arr[lt]);
                lt++;
            }
        }
        return answer;
    }
}
