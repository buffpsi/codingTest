package org.example.advancedExampleString;

import java.util.ArrayList;

//뒤집은 숫자가 소수이면 출력
//소수를 판단하는 함수 하난 두면 좋음 그래서 나는 isPrime로 둠
public class example3 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<n;i++){
            int tmp =arr[i];
            int res =0;

            //아래가 이제 숫자주어지면 뒤집는거
            while (tmp > 0){
                int t = tmp%10;
                res = res*10 + t;
                tmp = tmp/10;
            }
            if (isPrime(res)){
                answer.add(res);
            }

        }
        return answer;
    }

    //소수 판별 함수
    public boolean isPrime(int num){
        if (num == 1){
            return false;
        }for (int i =2; i<num; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
