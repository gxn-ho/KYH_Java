package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        //`do-while` 문은 `while` 문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는" + i);
            i++;
        }
    }
}
