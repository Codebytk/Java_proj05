package chapter07;

class A{
	
	//필드 : 객체 생성시 Heap 영역에 필드의 값이 저장됨,
		//Heap 변수 [필드] 의 값이 피어 있을 강제 초기화
				// 기본값
	int a;		//0
	boolean b;	//false
	double c;	//0.0
	String d;	//null
	
	//생성자: A(){} :기본적으로 생략되어있다.
	
	//필드의 기본값을 출력하는 메소드
	void defaultvalue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
}
class B{
	// 필드선언
	
	int m=3;
	int n=4;
	
	//기본생성자 생략됨: B(){}
	
	//메소드 선언
	void work1() {
		int k=5 ;
		System.out.println(k);
	work2(3);				//메소드 호출(work2(3))	
	}
	void work2(int i) {
		int j=4;
		System.out.println(i+j);
	}
	
	
}













public class Field_Component {

	public static void main(String[] args) {
		// 클래스 내부 구성 요소.
		//-Field : 필드
		//-Method : 매소드
		//-Constructor : 생성자
		
		// 메소드 내부에서 선언된 변수의 값은 Stack
		int e; //메소드 내부에서 선언된 변수는 Stack 에 변수와 같이 저장됨

		
		
		//1. 객체 생성
		A abc = new A();	//new A() : 기본 생성자 호출
		
		abc.defaultvalue(); //메소드 출력'
		
		System.out.println("===================");
		A bcd= new A();
		bcd.defaultvalue();
		
		System.out.println("===========");
		B b=new B();
		b.work1();
		
		
	}

}
