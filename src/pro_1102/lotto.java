package pro_1102;
import java.util.Scanner;

public class lotto {
	public static void main(String[] args) {
		
		double ran =( Math.random()*100);
		int random = (int)ran;
		int choice;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(random);
		System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정했습니다. 이 숫자를 맞춰보세요.");
		
		System.out.println("1~100 사이의 숫자를 입력해주세요.");
		
		while(true) {
		choice = sc.nextInt();
		
		if (choice < random) {
			
			
			System.out.println("UP!");
			}else if(choice > 100) {
				System.out.println("1~100사이의 값을 입력해주세요.");
			} else if(choice > random) {
				System.out.println("DOWN!");
			}else if(choice == random) {
				System.out.println("정답입니다!");
				System.out.println("정답입니다 ! 총 시도 횟수는 "+count +"회 입니다.");break;
				}
			
		if (choice != random) {
			count= count + 1;
			}
		
		}
	}
}
