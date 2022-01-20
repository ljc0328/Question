package hwjava04;

public class Refrigerator extends product{
	private int capa;//용량
		
	Refrigerator(int number,String name, int price, int total, int capa){
		super(number, name, price, total);
	}

	void showRecentInfo() {
		super.showRecentInfo();
		System.out.println("capa: "+capa);
	}
}
