package Pro_1103;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		int money; //받은 금액
		int price; //상품 가격
		int unit[] = {500,100, 50, 10}; //거스름
		Scanner sc = new Scanner(System.in);
		
		System.out.println("돈을 지불하세요.");
		
		System.out.println("받은 금액 :");
		money = sc.nextInt();
		
		System.out.println("상품 가격 :");
		price = sc.nextInt();
		
		int change = money - price;
		int count = 0;
		
		System.out.println("거스름돈 :");
		for(int i=0; i<unit.length; i++) {
			count = change / unit[i];
			System.out.println(unit[i] + "원 동전 " + count +"개");
			change %= unit[i];
		}
		

	}

}
