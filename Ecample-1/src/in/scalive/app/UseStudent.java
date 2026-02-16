package in.scalive.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.scalive.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("in/scalive/resources/beanConf.xml");
		BeanFactory container = new XmlBeanFactory(rs);
		Student s1 = (Student)container.getBean("stObj1");
		System.out.println("Roll = "+s1.getRoll());
		System.out.println("Roll = "+s1.getName());
		
	}

}
