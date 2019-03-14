package TEST01;

public class test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 p=new demo1();
		p.name="zhang";
		p.setAge(12);
	}

}
class demo1{
	public String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//public class test_01{
//	public test_01() {
//		System.out.println("这是一个无参数的构造方法");
//	}
//	public test_01(int a) {
//		this();
//		System.out.println("这是一个有参数的构造方法");
//	}
//	public static void main(String[] args) {
//		test_01 d=new test_01();
////		d.test();
////		d.test(1);
//	}
//}
//class Demo2{
//	public static String name;
//	public int age;
//	public static void a() {
//		
//	}
//}



















