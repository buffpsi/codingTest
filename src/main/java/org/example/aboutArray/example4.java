package org.example.aboutArray;

import java.util.ArrayList;

//두 배열 합 치기 문제 정렬된 n개의 arr배열과 m개의 arr2배열이 있을 때 합쳐서 정렬하는방법
//ex) 3개의 arr배열은 123, 4개의 정렬된 arr2배열은 2467 이라면 answer는 1,2,2,3,4,6,7로 나와야함
//정렬을 쓰면 시간복잡도 nlogn이므로 더 빠르게 하는방법을 사용해야하
// 그래서 포인터 개념으로 찝어주면서 하면된다
public class example4 {
    public ArrayList<Integer> solution(int n , int[] arr, int m, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        while(p1<n && p2 < m){
            if (arr[p1]<arr2[p2]){
                answer.add(arr[p1]);
                p1++;
            }else {
                answer.add(arr2[p2]);
                p2++;
            }
        }
        while (p1<n){
            answer.add(arr[p1]);
            p1++;
        }

        while (p2<m){
            answer.add(arr2[p2]);
            p2++;
        }
        return answer;
    }

}
