package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println(n + "개의 정수를 입력하세요: ");

        int maxNumber;
        int minNumber;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 입력받은 후에 있어야 함. 안그러면 초기 배열 설정 시에 다 0으로 채워넣기 때문에 0으로 초기화하는 거임.
        maxNumber = minNumber = numbers[0];

        for (int i = 0; i < n; i++) {
            // 따로 따로!!!
            if (numbers[i] > maxNumber) {   // == 없는게 더 효율적일거같.
                maxNumber = numbers[i];
            }
            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);


    }
}
