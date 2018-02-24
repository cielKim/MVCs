package polymorphism;
import java.lang.Integer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//1.Spring 컨테이너 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//2.Spring 컨터네이너로부터 필요한 객체 요청 
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeDown();
		tv.volumeUp();
		tv.powerOff();
		String hi = "33";
		Integer.parseInt(hi);
		
		factory.close();
	}

}
