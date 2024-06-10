package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");

            System.out.print("선택: ");
            int choice = scanner.nextInt(); // 1, 2, 3, 4

            // switch문으로도 가능하지만 일단 메서드 추출 리펙토링에 집중해서 작성한 코드
            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                int depositAmount = scanner.nextInt(); // 10000, ...
                balance = deposit(balance, depositAmount);
            } else if (choice == 2){
                System.out.print("출금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                balance = withdraw(balance, withdrawAmount);
            } else if (choice == 3) {
                System.out.println("현재 잔액: " + balance);
            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("메뉴 선택이 잘못되었습니다. 다시 입력해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);}
        else {System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");}

        return balance;
    }
}
