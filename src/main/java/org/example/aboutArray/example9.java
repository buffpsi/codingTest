package org.example.aboutArray;


//0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
//        만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
//        1 1 0 0 1 1 0 1 1 0 1 1 0 1
//        여러분이 만들 수 있는 1이 연속된 연속부분수열의 길이는 8이다 1 1 0 0 1 1 1 1 1 1 1 1
//


//초반 생각 lt,rt를 통해서 투포인트로 가고, 만약에 lt가 max보다 커지면 종료하면 될 것같음
public class example9 {
    public int solution(int n, int k, int arr[]) {
        int answer = 0, lt = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;
                    lt++;
                }
            }
            answer = Math.max(answer, i - lt + 1);
        }
        return answer;
    }
}
