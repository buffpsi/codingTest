package org.example.aboutArray;

//임시반장 구하기 문제

public class example2 {
    public int solution(int n, int[][]arr){
        int answer =0 , max = Integer.MIN_VALUE;
        for (int i=1; i<=n; i++){
            int cnt =0;
            for (int j=1;j<=n;j++){
                for (int k=1; k<=5; k++){
                    if (arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt>max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}
