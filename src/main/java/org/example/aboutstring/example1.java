package org.example.aboutstring;


import java.util.Scanner;

//str에는 특정 문자열이 주어지고 해당 문자열에 t라는 문자가 몇개있는지 알아보는함수
public class example1 {
    public int solution(String str, char t) {
        int answer = 0;

//        //해답1
//        //문자열의 길이를 나타낼때 .length() , 배열길이는 length로 표현가능
//        for (int i = 0; i < str.length(); i++) {
//            //문자열의 i번째 인덱스를 알아보는 라이브러리 함수 charAt(i)를 사용하면 쉽게 풀린다.
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }

        //해당2 for each문을 사용 , 문자열을 문자배열로 만들어줘야함 코드 더 간결해짐
        for (char a : str.toCharArray()){
            if (a == t){
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