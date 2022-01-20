package hwjava04;

public class productTest {
	
	public static void main(String[] args) {
		product[] pd = new product[6];
		
		pd[0] = new TV(01, "samsungTV", 500000, 5, 50, "led");
		pd[1] = new TV(02, "LGTV", 450000, 5, 50, "lcd");
		pd[2] = new TV(03, "ssafyTV", 777777, 7, 77, "?");
		pd[3] = new Refrigerator(04, "samsungR", 200000, 2, 100);
		pd[4] = new Refrigerator(05, "LGR", 300000, 3, 50);
		pd[5] = new Refrigerator(06, "ssafyR", 200000, 4, 70);
	
		for (int i = 0; i < pd.length; i++) {
			pd[i].showRecentInfo();
		}
	}
}
