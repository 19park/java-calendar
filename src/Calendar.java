import java.util.Scanner;

public class Calendar {
    private final int[] MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int getMaxDaysOfMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public void printSampleCalendar() {
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public static void main(String[] ar) {
        Calendar cal = new Calendar();

        // 숫자를 입력받아 해당하는 달의 최대 일수를 출력
        String PROMPT = "cal> ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("반복횟수를 입력하세요.");

        int month = 1;
        while (true) {
            try {
                System.out.println("달을 입력하세용 ㅋ");
                System.out.print(PROMPT);

                month = scanner.nextInt();
                if (month == -1) {
                    break;
                }

                if (month > 12) {
                    continue;
                }
                System.out.printf("%d월은 %d일까지 있슴ㅋ.\n", month, cal.getMaxDaysOfMonth(month));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }

        System.out.println("Bye..");
        scanner.close();
    }
}
