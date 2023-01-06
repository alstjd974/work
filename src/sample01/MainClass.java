package sample01;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("헬로우 자바");
		
		// 한줄 주석문 → 컴파일이 되지 않는다.
		
		/* (시작)
		 * 
		  범위 주석문
		  HTML <!-- -->
		  
		  JSP <%-- -->
		  
		  mySQL -- 
		  
		  python # """ 주석문 """
		  
		(끝) */ 
		
		/*
		 * 블록 주석문 단축키 ctrl + shift + / 
		 * 블록 주석문 해제키 ctril + shift + \
		 */ 
		
		// ln 개행
		System.out.println("Hello World");
		
		System.out.print("Hello");
		System.out.print(" ");
		System.out.print("월드");
		
		// 기능 : escape(탈출) sequence(질의)
		//       \n(개행) , /b(backspace) , \"(따음표) , \t(뜨어쓰기) , \\
		
		System.out.print("World\n");
		System.out.println("헬로우");		
		
		System.out.println("\"Hello World\"");
		
		System.out.println("\tHello\tWorld");
		System.out.println("\t월드\t헬로우");
		
		System.out.println("\\헬로우 월드\\");
		
		//              format
		System.out.printf("--%s--\n","Hello");
		//               표현자료형   값
		System.out.printf("--%d--\n" , 1024);
		
		System.out.println("Hello" + " " + "world");
		
	}
}
