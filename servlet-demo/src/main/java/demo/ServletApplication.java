package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by 15050886 on 2017/4/5.
 */
@SpringBootApplication
public class ServletApplication {
    /**
     * 功能描述: <br>
     * main 入口
     *
     * @param args
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static void main(String[] args) {
        // 启动后，浏览器中输入：http://localhost:8080/home ->可直接访问
        SpringApplication.run(ServletApplication.class,args);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MyServlet(), "/home/*");// ServletName默认值为首字母小写，即myServlet
    }
}
