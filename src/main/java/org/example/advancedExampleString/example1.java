package org.example.advancedExampleString;

//만약 s에 문자열이 주어지고 t에 문자가 주어졌을때 문자열의 각 문자들의 t와 얼마나 떨어졌는지 찾고 최소값기준으로 적으면된다.
public class example1 {
    public int[] solution(String s, char t){
        int answer[] = new int[s.length()];

        //일단 t라는 문자가 가장 왼쪽에 있다고 생각하고 넣어놓기
        //여기서는 cnt를통해서 문자와의 거리를 숫자로 판별하는게 핵심 알고리즘이다.
        for (int i=0; i<s.length(); i++){
            int cnt = 1000;
            if (s.charAt(i)!=t){
                answer[i] = cnt;
                cnt ++;
            }else {
                cnt =0;
                answer[i] = cnt;
            }
        }
        //오른쪽에서 부터 가기
        for (int i=s.length()-1; i>0; i--){
            int cnt = 1000;
            if (s.charAt(i)==t){
                cnt =0;
            }else {
                cnt =0;
                answer[i] = Math.min(answer[i],cnt);
            }
        }

        return answer;
    }
}
