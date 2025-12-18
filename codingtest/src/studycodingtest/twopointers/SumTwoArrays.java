package studycodingtest.twopointers;
/*
1) 1차원 누적합 기본 개념
S[i] = S[i-1] + A[i]

2) 2차원 누적합 공식
S[x][y] = S[x-1][y] + S[x][y-1] − S[x-1][y-1] + A[x][y]




sum = S[x2][y2] − S[x1-1][y2] − S[x2][y1-1] + S[x1-1][y1-1]
  정렬된 배열에서 두 숫자의 합이 특정 목표값이 되는 두 숫자를 찾기
  input num = [1,2,4,7,11,15], target = 9;

    n(리스트 크기) m(질의 수)
    A(원본 리스트), D(합 배열)
    for (n 반복)
        원본 리스트 저장
    for (i=1 ~ n까지 반복)
        for j를 1부터 n까지 반복
        합 배열 저장
        공식 : D[x][y] = D[x-1][y] + D[x][y-1] − D[x-1][y-1] + D[x][y]
    (X1,Y1,X2,Y2)
    for (m만큼 반복)
        질의에 대한 결과 계산 및 출력
        D[X2][Y2] - D[X1-1][Y2] - D[X2][Y1 -1] + D[X1 -1][Y1 -1]
*/
public class SumTwoArrays {

    public static int[] sumTwoArrays(int[] nums,int target){
        int left = 0; // 왼쪽 포인터
        int right = nums.length - 1; // 오른쪽 포인터

        while (left < right){
            int sum = nums[left] + nums[right];  // 두 포인터의 합 저장

            // 첫번째 탈출 방법
            if (sum == target){
                return new int[] {left, right};
            }else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        // 아무것도 못찾으면 출력 x
        return new int[] {0};
    }
    public static void main(String[] args) {
        int [] nums = {1,2,4, 7, 11 ,15};
        int target = 9;

        int [] result = sumTwoArrays (nums, target);

        if(result.length == 2){
            System.out.println("두 숫자의 인덱스: ["+result[0] +"," + result[1] +"]");
        }else{
            System.out.println("조건에 맞는 두 숫자가 없다.");
        }
    }

}
