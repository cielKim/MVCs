package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체생성 ");
	}
	@Override
	public void volumeUp() {
		System.out.println("애플스피커 볼륨 옵");
	}

	@Override
	public void volumeDown() {
		System.out.println("애플스피커 볼륨 다운");
	}

}
