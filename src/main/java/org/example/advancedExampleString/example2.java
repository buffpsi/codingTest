package org.example.advancedExampleString;

//에라토스테네스 체 1부터N까지의 숫자중 소수가 몇개있니?
//풀이방법 일단 N+1까지의 숫자가 담긴 배열을 하나 만든다.
//이유는 for문을 돌아야하는데 다음 숫자까지 포함해야하니까
public class example2 {
    public int solution(int N) {
        int cnt = 1;
        int arr[] = new int[N + 1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt++;
                for (int j = i; j < N + 1; j = j + i) { //j는 i배수만큼 지워야하니까 j+i 커져야함
                    //ex) i가 2이고 N이 20이라면 소수기떄문에 2의 배수들은 다 1로 바꾼다는 개녀임
                    arr[j] = 1;
                }
            }
        }
        return cnt;
    }
}
