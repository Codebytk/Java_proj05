package chapter13.ex05;

// 인터패이스를 상속하는 이너클래스

interface C{
	//public abstract 생략됨
	void bcd();
	
}

class A{
	
	//B 를 객체화 해서 C 타입으로 선언
	C c = new B();
	void abc() {
		c.bcd();	// C 인터페이스의 bcd(); 호출, 구현한 클래스의 B의 bcd() 호출
	}
	
	//이너클래스 : 인터페이스를 상속하는 이너클래스
	class B implements C{
		@Override
		public void bcd() {System.out.println("인스턴스 이너클래스");	}
		
	}
	
}



public class AnonimousClass01 {

	public static void main(String[] args) {
		//1. 객체 생성 후 메소드 호출
		
		A a = new  A ();
		a.abc();			//인터페이스의 구현한 클래스의 메소드
		
	}

}