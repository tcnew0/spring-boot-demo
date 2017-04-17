package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main App
 */
@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class,args);
    }

//    @Bean
//    public FilterRegistrationBean registrationBean(){
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setName("greeting");
//        MyFilter greetingFilter = new MyFilter();
//        registrationBean.setFilter(greetingFilter);
//        registrationBean.setOrder(1);
//        List<String> urlList = new ArrayList<String>();
//        urlList.add("/*");
//        registrationBean.setUrlPatterns(urlList);
//        return registrationBean;
//    }

//    @Bean
//    @Order(1)
//    public Filter greetingFilter() {
//        return new MyFilter();
//    }
}
