package inflearncodingtest.string;

import java.util.Scanner;

class Main{
    public int solution(String str, char t){
        int answer =0;
        //toUpperCase()로 전부 다 대문자 받아!!
        // 문자열 받고
        str =str.toUpperCase();
        // 한글자 받고
        t = Character.toUpperCase(t);
        System.out.println(str+" " + t);
        // 향상된 for문 사용 가능
        // 향상된 for문에서 뒤에 오는건 배열, Iterator 를 제공하는 대상에만 가능
        for (char x : str.toCharArray()){
            if(x == t){
                answer++;
            }
        }
       /* for(int i =0; i<str.length(); i++){
            if (t == str.charAt(i)) {
                answer++;
            }
        }*/
        return answer;
    }
}

public class FindChar {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 문자열을 읽고 받아
        //공백 포함으로 전부다 받아 들이고 그냥 한 문자로 잘라
        char c = sc.nextLine().charAt(0);
        System.out.print(T.solution(str,c));
    }
}

