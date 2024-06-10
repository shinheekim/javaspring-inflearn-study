package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {  // 홀수 짝수 구분 함수 - 어느 경우에도 항상 리턴을 해야 함.
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
