package com.cloudwise.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 *
 * xxl-job配置
 * @author aiden
 * @date 2021/9/29 3:45 下午
 * @return 
 */
@Data
@ConfigurationProperties(prefix = "xxl.job")
public class XxlJobProperties {

	@NestedConfigurationProperty
	private XxlAdminProperties admin = new XxlAdminProperties();

	@NestedConfigurationProperty
	private XxlExecutorProperties executor = new XxlExecutorProperties();

}
