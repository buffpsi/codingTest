package org.example.aboutstring;


import java.util.Scanner;

//str에는 특정 문자열이 주어지고 해당 문자열에 t라는 문자가 몇개있는지 알아보는함수
public class example1 {
    public int solution(String str, char t) {
        int answer = 0;

        //문자열의 길이를 나타낼때 .length() , 배열길이는 length로 표현가능
        for (int i = 0; i < str.length(); i++) {
            //문자열의 i번째 인덱스를 알아보는 라이브러리 함수 charAt(i)를 사용하면 쉽게 풀린다.
            if (str.charAt(i) == t) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        example1 e = new example1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(e.solution(str, c));
    }

}