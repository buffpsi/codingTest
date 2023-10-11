package org.example.aboutArray;

//N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
//        만약 N=15이면
//        7+8=15
//        4+5+6=15
//        1+2+3+4+5=15
//        와 같이 총 3가지의 경우가 존재한다.

//초기 아이디어는 일단 배열에 넣기
//lt,rt더해보기
//example7가 많이 유사함

//public class example8 {
//    public int solution(int N){
//        int arr[] = new int[N];
//        for (int i=0; i<N; i++){
//            arr[i] += 1;
//        }
//
//        int answer =0 , lt =0;
//        int sum =0;
//        for (int i=0; i<N; i++){
//            sum += arr[i];
//            if (sum == N){
//                answer++;
//            }
//            while (sum>= N){
//                sum -= arr[lt];
//                lt++;
//                if (sum == N) answer++;
//            }
//        }
//        return answer;
//    }
//}

//수학적으로 어떻게 해결한 것인가?
// 위의 예제에서 보면 케이스를 일단 나눠보는 방식으로 해보면 될것같음
//일단 연속된 자연수의 합이기때문에-> 배열에는 (N/2)+1 개 밖에 못들어감
// 그리고 2가지,3가지,4가지...n가지 케이스를 한번 구해본다고 치면 연속된다? 1,2에 각각 추가해주면 된다 1,2,3에 각각 추가해주면된다
//3,6,10,15
public class example8 {
    public int solution(int N) {
        int answer = 0;
        int cnt = 1;
        N--;
        while (N > 0) {
            cnt++;
            N = N - cnt;
            if (N % cnt == 0) answer++;
        }
        return answer;
    }
}