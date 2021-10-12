package com.xxljob.demo.task;

import cn.hutool.extra.spring.SpringUtil;
import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author： aiden
 * @description：
 * @date： 2021/9/23 5:38 下午
 */
@Component
public class StartRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
//			XxlJobSpringExecutor xxlJobSpringExecutor = SpringUtil.getBean(XxlJobSpringExecutor.class);
//			xxlJobSpringExecutor.registJobHandler("demoTask", new DemoTask());

	}
}
