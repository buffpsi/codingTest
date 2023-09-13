package org.example.aboutstring;

import java.util.Scanner;

//문자열에서 중복 문자를 제거해야 할 때 => 해당 문자열에 있는 번쨰수와 indexof가 다르면된다
//로직을 생각하자 컴퓨터적으로 초기아이디어는 한문자를 배열로넣고 한번씩 돌려가면서 있으면없애려고했다
public class example4 {
    public String solution(String str){
        String answer = "";
        for (int i=0; i<str.length(); i++){
            if (str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        example4 e4 = new example4();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(e4.solution(str));
    }

}
