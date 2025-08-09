package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public void changeGear(int afterGear) {
		// TODO 自動生成されたメソッド・スタブ
		switch (afterGear) {
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;

		default:
			speed = 10;
			break;
		}
		

	}
	public void run() {
		System.out.println(speed);
		
	}
	

}
