package org.example.aboutstring;

import java.util.Scanner;

//문자열과 숫자가 섞여있을때 숫자만 연결해서 출력하려면?
public class example6 {
    public int solution(String s) {
        String answer = "";
        //1번 풀이 Character.isDigit(a) 함수 사용
        for (char a : s.toCharArray()) {
            if (Character.isDigit(a)) {
                answer += a;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        example6 e6 = new example6();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(e6.solution(str));
    }

}
