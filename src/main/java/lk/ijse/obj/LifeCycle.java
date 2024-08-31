package lk.ijse.obj;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("set beanFactory"+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean with after afterPropertiesSet  ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context is" +applicationContext);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("mn yanawooo");
    }


    @PreDestroy
    public void getLose(){
        System.out.println("last the bean");
    }
}
