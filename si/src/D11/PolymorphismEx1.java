package D11;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		Phone p =new Phone();
		SmartPhone sp = new SmartPhone();
		FolderPhone fp = new FolderPhone();
		calling(p);
		calling(sp);
		calling(fp);
		
	}
	//매개변수의 다양성
	
	public static void calling(Phone p) {
		p.call();
	}
	
}
class Phone{
	public String phoneNum;
	
	public void call() {
		System.out.println("전화를 거는 중입니다.");
	}
	public void get() {
		System.out.println("전화를 받는 중입니다.");
	}
}

class SmartPhone extends Phone{
	public void touch() {
		System.out.println("액정을 터치했습니다.");
	}
}
class FolderPhone extends Phone{
	public void fold() {
		System.out.println("핸드폰을 접었습니다.");
	}
}