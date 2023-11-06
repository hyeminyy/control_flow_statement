//다형성 
package Pro_1106;
class CoffeeOrder{
	int price; //가격(field)
	
	public CoffeeOrder(int price) { //coffeeorder mathod
		this.price=price;
	}
}
class Americano extends CoffeeOrder{ //coffeeorder 을 상속 받는 아메리카
	public Americano() {
		super(4000); //상위 메서드 생성자 호출 
	}
	public String toString() {
		return "아메리카노";
	}
}
class CafeLatte extends CoffeeOrder{ //동
	public CafeLatte() {
		super (5000);
	}
	public String toString() {
		return "카페라떼";
	}
}

class Customer{
	int money = 500000;
	void buyCoffee(CoffeeOrder coffeeorder) {
		if (money < coffeeorder.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money = money - coffeeorder.price;
		System.out.println(coffeeorder+"를 구매하셨습니다.");
	}
}

