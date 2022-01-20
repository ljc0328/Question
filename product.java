package hwjava04;

public class product{
	private int number; //제품번호
	private String name;//제품명
	private int price;//가격정보
	protected int total;//재고 수량
	
	product(int number, String name, int price, int total){
		this.number = number;
		this.name = name;
		this.price = price;
		this.total = total;
	}
	
	void modifyTotal(int t) {
		total = t;
	}
	
	void showRecentInfo() {
		System.out.println("제품번호: "+number);
		System.out.println("제품명: "+name);
		System.out.println("가격정보: "+price);
		System.out.println("재고수량: "+total);
	}
	
}
