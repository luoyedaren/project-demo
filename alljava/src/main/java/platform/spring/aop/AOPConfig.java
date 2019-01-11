package platform.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

	@Pointcut("execution(* platform.spring.aop.*.playNum(int))&& args(number)")
	public void playNum(int number){}

	@DeclareParents(value = "platform.spring.aop.GamerOne+",defaultImpl = NewFunctionImpl.class)
	public static NewFunction newAdd;


	@Before("perform()")
	public void start(){
		log.info("--------------@befoure ... start.......");
	}


	@Before("playNum(number)")
	public void play(int number){
		log.info("--------------------------@args "+number);
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
