import java.util.Scanner;

public class Sum {
    public static void main(String[] ar) {
        // 입력: 키보드로 두 수의 입력을 받는다.
        // 출력: 화면에 두 수의 합을 출력한다.
        System.out.println("두 수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        int a, b;
        String s1, s2;

        s1 = scanner.next();
        s2 = scanner.next();
        try {
            a = Integer.parseInt(s1.trim());
            b = Integer.parseInt(s2.trim());

            System.out.printf("%d와 %d의 합은 %d 입니다.", a, b, a + b);
            scanner.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
