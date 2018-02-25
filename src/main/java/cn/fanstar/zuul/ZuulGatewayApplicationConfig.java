package cn.fanstar.zuul;

import cn.fanstar.zuul.filter.PreRequestLogFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fanjun on 2018/2/25.
 */
@Configuration
public class ZuulGatewayApplicationConfig {

    @Bean
    public PreRequestLogFilter preRequestLogFilter(){
        return new PreRequestLogFilter();
    }

}
