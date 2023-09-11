package org.example.aboutstring;

import java.util.Scanner;

//대문자는 소문자로, 소문자는 대문자로 바꾸는 함수
// .isLowerCase() , .isUpperCase()
public class example2 {
    public String solution(String str) {
        String answer = "";

        //해당1 for each문을 사용 , 문자열을 문자배열로 만들어줘야함 코드 더 간결해짐
        for (char a : str.toCharArray()) {
            if (Character.isLowerCase(a)) {
                answer += Character.toUpperCase(a);
            } else {
                answer += Character.toLowerCase(a);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        example2 e2 = new example2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(e2.solution(str));
    }
}
