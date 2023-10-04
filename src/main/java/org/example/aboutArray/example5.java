package org.example.aboutArray;

import java.util.ArrayList;
import java.util.Arrays;

public class example5 {
    public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2) {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr[p1] == arr2[p2]) {
                answer.add(arr[p1]);
                p1++;
                p2++;
            } else if (arr[p1] < arr2[p2]) p1++;
            else p2++;

        }
        return answer;

    }
}
