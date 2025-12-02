package BackjonCodingTest;
/*
* 1 1 2 2 2 8 로 구성
* 배열 넣어서 비교를 하거나
* 아니면 그냥 각각 빼주면 될거 같은데
*
* */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner  =  new Scanner(System.in);
        /*
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();

        System.out.print((1 - king) + " ");
        System.out.print((1 - queen) + " ");
        System.out.print((2 - rook) + " ");
        System.out.print((2 - bishop) + " ");
        System.out.print((2 - knight) + " ");
        System.out.print((8 - pawn));
         */

        // 기존 배열
        int [] chessPiece =  {1,1,2,2,2,8};

        // 입력을 받아
        int [] userPiece = new int[6];

        for (int i = 0; i < 6; i++) {
            userPiece[i] = scanner.nextInt();
        }

        // 차 구하기
        for(int i=0;i<6;i++){
            System.out.print((chessPiece[i] - userPiece[i])+" ");
        }
    }
}
