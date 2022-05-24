package dependencyInjuctionWithoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void  main(String args[])
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		TestImpl bean = context.getBean("test", TestImpl.class);
		bean.display1();
		bean.display();
	}

}
