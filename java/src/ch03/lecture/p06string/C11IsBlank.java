package ch03.lecture.p06string;

public class C11IsBlank {
	public static void main(String[] args) {
		// isBlank
		// 공백문자만 있는 지 확인?
		// return type : boolean
		
		String str1 = "  java  ";
		String str2 = "     ";
		String str3 = """
				
				   
				""";
		String str4 = "";
		
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		System.out.println(str4.isBlank());
		
		System.out.println(str1.trim().isEmpty());
		System.out.println(str2.trim().isEmpty());
		System.out.println(str3.trim().isEmpty());
		System.out.println(str4.trim().isEmpty());
		
	}
}


