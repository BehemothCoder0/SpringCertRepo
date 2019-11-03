package siddu.springcert.spring5certapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCyle implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware {	
	
	public BeanLifeCyle() {
		System.out.println("The BeanLifeCycle Constructor is being called");
	}

	@Override
	/**
	 * This is candidate of InitializingBean interface
	 * */
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Bean Properties Set");

	}

	@Override
	/**
	 * This is candidate of DisposableBean interface
	 * */
	public void destroy() throws Exception {
		System.out.println("Calling the Bean Destroy Method");
		
	}

	@Override
	/**
	 * This is candidate of BeanNameAware interface
	 * */
	public void setBeanName(String name) {
		System.out.println("The bean name is:"+name);
	}

	@Override
	/**
	 * This is candidate of BeanFactoryAware interface
	 * */
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("The Bean Factory details are:"+beanFactory.isSingleton("beanLifeCyle"));
		
	}

	@Override
	/**
	 * This is candidate of ApplicationContextAware interface
	 * */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("The Application Context is:"+applicationContext.getDisplayName());
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Calling PostConstruct Method");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Calling Pre Destroy Method");
	}
	
	public void beforeInit() {
		System.out.println("Calling BeanPostProcessor Before Init Method");
	}
	
	public void afterInit() {
		System.out.println("Calling BeanPostProcessor After Init Method");
	}

}
