package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] score = new int[4][3];  // 학생 수 4명, 과목 3개

        String[] subjects = {"국어", "영어", "수학"};   // 문자열 배열에 담기


        for (int i = 0; i < score.length; i++) {

            // i+1번, 그리고 for문 두번째 안에 들어가있으면 안됨!
            System.out.println((i+1) + "번 학생의 성적을 입력하세요");

            for (int j = 0; j < score[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                score[i][j] = scanner.nextInt();
            }
        }

        // 어차피 for문 안에서 사용할 거라면 전역 변수로 말고 지역 변수로 하는게 낫다!
        int sum = 0;
        double average = 0;

        for (int i = 0; i < score.length; i++) {
//            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
//            double average;
            average = (double) sum/score[i].length; // 나눌 때 score.length X, score[i].length O
            
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균: " + average);
            // (i+1) 번 학생의 총점. for문의 i변수를 사용할 때, i가 0부터 시작하면 인덱스 번호임을 인지하기. 헷갈리지 않으려면 1부터 시작해도 ㄱㅊ
            
            sum = 0;    // 초기화 시켜줘야 함.
        }
    }
}
