package polymorphism;


public class LgTV implements TV{
	public LgTV() {
		System.out.println("엘지티비 생성");
	}
	public void powerOn() {
		System.out.println("엘지티비 켠다");
	}
	public void powerOff() {
		System.out.println("엘지티비 끈다");
	}
	
	public void volumeUp() {
		System.out.println("엘지티비 소리올린다");
	}
	
	public void volumeDown() {
		System.out.println("엘지티비 소리내린다");
	}

}
