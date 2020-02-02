package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

//配置类，作用于bean一样
/*@Configuration spring 新注解，指定当前类是一个配置类
* @ComponenScan 用于通过注解指定要扫描的包
* @Bean  用于把当前方法的返回值作为返回值存入容器
*      属性 ：name  默认值是当前方法的名称
* @Import
* 导入其他配置类
* */
@Configuration
@ComponentScan({"com.ping","config"})
@Import(JDBCConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
