package studycodingtest.twopointers;
/*
    알파벳과 숫자만 검사하며, 대소문자는 구분하지 않아
    공백이나 특수 문자는 무시
    두 문자가 같은지 체크
 */
public class ValidPalindron {
    public static boolean ValidPalindron(String s){
        int left = 0;
        int right = s.length() -1;

        while (left <  right){
            // 공백이 있으면 넘어가야해
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            // 두 수가 같지 않으면?
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] testCase = {
                "RACE ACAR",          // true
                "A",                  // true
                "AB CDEFGFEDCBA",     // true
                "ABC",                // false
                "AB CBA",             // true
                "AB,BA",              // true
                "RACE ACAR",          // true
                "No lemon, no melon", // true (추가)
                "Was it a car or a cat I saw?", // true (추가)
                "hello",              // false (추가)
        };

        for (String tc : testCase) {
            boolean result = ValidPalindron(tc);
            System.out.println("Input: \"" + tc + "\" → " + result);
        }
    }
}