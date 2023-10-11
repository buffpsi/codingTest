package org.example.aboutArray;

//N개의 수로 이루어진 수열이 주어집니다.
//        이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
//        만약 N=8, M=6이고 수열이 다음과 같다면
//        1 2 1 3 1 1 1 2
//        합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
//        입력
//        첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
//        수열의 원소값은 1,000을 넘지 않는 자연수이다.

import java.util.Scanner;

//답안 방향성 lt,rt를 이용해서 푼다.
public class example7 {
    public int solution(int N, int M, int arr[]) {
        int answer =0, sum =0 , lt=0;
        for (int rt =0; rt<N; rt++){
            sum +=arr[rt];
            if (sum==M){
                answer ++;
            }
            while(sum>= M){
                sum -= arr[lt++];
                if (sum==M) answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        example7 T = new example7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}

//아래는 초안 ==> 이렇게하면 맨처음에 가리키는 값을 알 수 가 없음 =>sum -= arr[cnt]; 이부분이 잘못된 내 생각은 첫값을 뺄려고했는데 잘못 생각함
//public class example7 {
//    public int solution(int N, int M, int arr[]) {
//        int answer = 0;
//        int cnt = 0;
//        int sum = 0;
//        //슬라이싱
//        while (cnt < arr.length) {
//            if (sum < M) {
//                sum += arr[cnt];
//            } else if (sum > M) {
//                sum -= arr[cnt];
//            } else answer++;
//            cnt++;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        example7 T = new example7();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.print(T.solution(n, m, arr));
//    }
//
//}
