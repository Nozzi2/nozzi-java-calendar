package nozzi.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> "; 
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		while (month != -1) {
			System.out.println("���� �Է��ϼ���.");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			cal.printSampleCalendar(month);
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month, cal.getMaxDayOfMonth(month));
			
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
