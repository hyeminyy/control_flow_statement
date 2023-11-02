package pro_1102;
import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("윤년을 알아봅시다!");
		while(true) {
		System.out.println("년도를 입력해주세요.");
		year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
		}
	}
	
}

