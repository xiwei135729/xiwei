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
	String chexing="����";
	void start() {
		System.out.println(chexing+"���ٶ�"+speed+"��ʼ��");
	}
	void move() {
		System.out.println(chexing+"���ٶ�"+speed+"��ʼ�ƶ���");
	}
	void speedup() {
		System.out.println(chexing+"���ٶ�"+speed+"��ʼ������");
	}
	void speeddown() {
		System.out.println(chexing+"���ٶ�"+speed+"��ʼ������");
	}
	void stop() {
		System.out.println(chexing+"���ٶ�"+speed+"ͣ����");
	}
}