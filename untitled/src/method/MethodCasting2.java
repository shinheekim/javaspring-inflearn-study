package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }

    public static void printNumber(double n) {  // double -> int 자동 형변환 적용
        System.out.println("숫자: " + n);
    }
}
