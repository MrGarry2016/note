1. how to set up confihure in beans.xml

<context:property-placeholder 
		location="classpath:config/common.properties,classpath:config/${env}.properties,file:${overriddenPropertiesFilePath}" 
		ignore-unresolvable="true"  
		ignore-resource-not-found="true" />
##In XML, new properties files can be made accessible to Spring via the <context:property-placeholder … >

<context:component-scan base-package="com.processminer.util" />
##http://www.mkyong.com/spring/spring-auto-scanning-components/
##Put this “context:component” in bean configuration file, it means, enable auto scanning feature in Spring. The base-package is indicate where are your components stored, Spring will scan this folder and find out the bean (annotated with @Component) and register it in Spring container.

<bean id="Configuration" class="com.processminer.util.Configuration"/>

public class Configuration {
	
	public static final String CEDARSPRINGS = "cs";
	public static final String BIGISLAND = "bi";
	
	@Value("${aws.access.key.id}")
	private String awsAccessKeyId;

	...
}