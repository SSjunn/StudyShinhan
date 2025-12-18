package studycodingtest.string;

public class N_aryNubmerGame {
    /*
     n 2진수 (이해된거 같음) or 16 진수 (이건 뭔데 0~F 까지 해서 구하라고?)
     char[] digits = "0123456789ABCDEF".toCharArray(); String temp = ""; while (num > 0) { temp += digits[num % n];
     // n진법 나머지 num /= n; } temp = new StringBuilder(temp).reverse().toString(); 일단 이렇게 하라는거잖아....
     그리고 t까지로 돌리면 되는거 아닌가?
      */
    static class Solution {
        public String solution(int n, int t, int m, int p) {
            char[] digits = "0123456789ABCDEF".toCharArray();

            // n진수 변환 함수
            java.util.function.IntFunction<String> convert = (num) -> {
                if (num == 0) return "0";
                StringBuilder sb = new StringBuilder();
                int temp = num;
                while (temp > 0) {
                    sb.append(digits[temp % n]);
                    temp /= n;
                }
                return sb.reverse().toString();
            };

            // 전체 숫자 이어붙이기
            // t*m 으로 튜브가 말할 글자 가져기
            StringBuilder total = new StringBuilder();
            int num = 0;
            while (total.length() < t * m) {
                total.append(convert.apply(num));
                num++;
            }

            // 튜브가 말해야 하는 문자만 추출
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < t; i++) {
                answer.append(total.charAt(i * m + (p - 1)));
            }

            return answer.toString();
        }
    }

    // main 메서드 추가
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트 케이스 1
        System.out.println(sol.solution(2, 4, 2, 1));
        // expected: 0111

        // 테스트 케이스 2
        System.out.println(sol.solution(16, 16, 2, 1));
        // expected: 02468ACE11111111

        // 테스트 케이스 3
        System.out.println(sol.solution(16, 16, 2, 2));
        // expected: 13579BDF01234567
    }
}
