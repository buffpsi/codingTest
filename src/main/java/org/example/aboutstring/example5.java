package org.example.aboutstring;

import java.util.Scanner;

//펠린드롬 => 회문 문자열 판떄
// 짝수,홀수 둘다 받는 문자열에서 2로나눠서 같은지 체크하면
public class example5 {
    public String solution(String str){
        String answer = "yes";
        //1번 직관적으로 바로 생각 난 풀이
        for (int i=0;i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length() -1 - i)){
                answer = "no";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        example5 e5 = new example5();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(e5.solution(str));
    }

}
