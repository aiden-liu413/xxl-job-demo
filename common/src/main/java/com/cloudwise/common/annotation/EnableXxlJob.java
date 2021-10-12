package com.cloudwise.common.annotation;

import com.cloudwise.common.XxlJobAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 *
 * 激活xxl-job配置
 * @author aiden
 * @date 2021/9/29 3:45 下午
 * @return 
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({ XxlJobAutoConfiguration.class })
public @interface EnableXxlJob {

}
