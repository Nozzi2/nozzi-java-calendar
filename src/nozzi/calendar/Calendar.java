package nozzi.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDayOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar(int month) {
		System.out.printf("      <<%4d년%3d월>>\n", 2022, month);
		System.out.println(" Su Mo Tu We Th Fr Sa");
		System.out.println("---------------------");
		for(int i = 1; i <= getMaxDayOfMonth(month); i++) {
			System.out.printf("%3d", i);
			if(i%7 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		while (month != -1) {
			System.out.println("달을 입력하세요.");
			month = sc.nextInt();
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			cal.printSampleCalendar(month);
			System.out.printf("%d월은 %d일까지 있습니다.", month, cal.getMaxDayOfMonth(month));
			
		}
	}

}
