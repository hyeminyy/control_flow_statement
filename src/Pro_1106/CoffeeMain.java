package Pro_1106;

public class CoffeeMain {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buyCoffee(new Americano());
		customer.buyCoffee(new CafeLatte());
		
		System.out.println("현재 잔액 :" +customer.money);
	}
}

