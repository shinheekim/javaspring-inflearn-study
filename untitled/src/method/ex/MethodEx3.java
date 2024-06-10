package method.ex;
public class MethodEx3 {
    public static void main(String[] args) {
        // 이렇게 입금, 출금 부분을 메서드로 명확하게 분리하여 리펙토링하는 것을 메서드 추출(Extract Method)라 한다.
        // 구조적으로 읽기 쉽고 유지보수 하기 좋은 코드!
        int balance = 10000;

        balance = deposit(balance, 1000);    // 11000원
        balance = withdraw(balance, 2000);  // 9000원

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount) {     // 이미 있는 돈, 입금할 돈
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

}