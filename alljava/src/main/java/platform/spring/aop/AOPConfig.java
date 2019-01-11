package platform.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/10 0010. - 星期四
 * nickName louyedaren
 * 切面
 */
@ComponentScan("platform.spring.aop")
@Configuration
@Aspect
@Slf4j
public class AOPConfig {

	@Pointcut(value = "execution(* platform.spring.aop.*.perform(..))")
	public void perform() {}

	@Before("perform()")
	public void start(){
		log.info("--------------@befoure ... start.......");
	}

	@Around("perform()")
	public void around(ProceedingJoinPoint point){
		log.info("-----------------around-------------");
		try {
			point.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		log.info("-----------------around-------------");
	}


}
