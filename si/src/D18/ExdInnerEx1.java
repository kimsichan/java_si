package D18;

public class ExdInnerEx1 {

	public static void main(String[] args) {
		A.InnerB b = new A.InnerB();
		A a = new A();
		A.IneerD d = a.new IneerD();
	}

}
class A{
	public class IneerD{
		
	}
	public static class InnerB{
		
	}
	private class InnerC{
		public int num =10;
	}
	public void test() {
		InnerC c = new InnerC();
		c.num = 20;
		System.out.println(c.num);
	}
}