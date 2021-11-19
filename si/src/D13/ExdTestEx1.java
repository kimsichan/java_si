package D13;

public class ExdTestEx1 {
	public static void main(String[] args) {
		ExdLGTvReomteCon lgr = new ExdLGTvReomteCon(30, 900);
		lgr.volumnUp();
		lgr.powerOn();
		for(int i = 1; i<=31 ; i++) {
			lgr.volumnUp();
		}
		for(int i = 1; i<=32 ; i++) {
			lgr.volumnDown();
		}
		System.out.println(lgr.LOGO);
		lgr.changeChannel(900);
		lgr.powerOff();
	}
}
