package hwjava04;

public class TV extends product{
	private int inch;//인치
	private String type;//타입
	
	TV(int number,String name, int price, int total, int inch, String type){
		super(number, name, price, total);
	}

	void showRecentInfo() {
		super.showRecentInfo();
		System.out.println("inch: "+inch);
		System.out.println("type: "+type);
	}
}
