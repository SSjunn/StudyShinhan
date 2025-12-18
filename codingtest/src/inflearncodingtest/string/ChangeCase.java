package inflearncodingtest.string;

import java.util.Scanner;

public class ChangeCase {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            // 아스키 코드
            // 대문자 65~90
            // 소문자 97~122
            //isLowerCase : 소문자인지 찾는 함수
/*            if(Character.isLowerCase(x)){
                answer+=Character.toUpperCase(x);
            }else{
                answer+=Character.toLowerCase(x);
            }*/
        }

        return answer;
    }
    public static void main(String[] args) {
        ChangeCase T = new ChangeCase();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));

    }
}
