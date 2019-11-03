package siddu.springcert.spring5certapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCyclePostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof BeanLifeCyle) {
			((BeanLifeCyle) bean).beforeInit();
		}
		return bean;
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof BeanLifeCyle) {
			((BeanLifeCyle) bean).afterInit();
		}
		return bean;
	}

}
