import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<String> authorityAdmin = new ArrayList<String>();
		authorityAdmin.add("관리자");
		authorityAdmin.add("슈퍼 관리자");
		
		System.out.println(authorityAdmin.indexOf("슈퍼 관리자"));
		
		
	} 
	
}
