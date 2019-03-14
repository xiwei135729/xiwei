package test_01;

public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle p1=new Vehicle();
		p1.start();
		p1.move();
		p1.speedup();
		p1.speeddown();
		p1.stop();

	}

}
class Vehicle{
	int speed=90;
	String chexing="宝马";
	void start() {
		System.out.println(chexing+"以速度"+speed+"开始了");
	}
	void move() {
		System.out.println(chexing+"以速度"+speed+"开始移动了");
	}
	void speedup() {
		System.out.println(chexing+"以速度"+speed+"开始加速了");
	}
	void speeddown() {
		System.out.println(chexing+"以速度"+speed+"开始减速了");
	}
	void stop() {
		System.out.println(chexing+"以速度"+speed+"停车了");
	}
}