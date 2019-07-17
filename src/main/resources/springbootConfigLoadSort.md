1、命令行参数;
2、来自java:comp/env的JNDI属性;
3、Java系统属性(System.getProperties());
4、操作系统环境变量
5、RandomValuePropertySource配置的random.*属性值;
6、jar包外部的application-{profile}.properties或yml(带spring.profile)配置文件;
7、jar包内部的application-{profile}.properties或yml配置文件;
8、jar包外 (不带spring.profile)配置文件;
9、jar包内(不带spring.profile)配置文件;
10、@Configuration注解类上的@PropertySource;
11、通过SpringApplication.setDefaultProperties;