package com.soft1851.spring.web.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author ke
 * @ClassName WebApplicationConfig
 * @Description TOOD
 * @Date 2020/3/24
 * @Version 1.0
 **/
public class WebApplicationConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //将WebMvcConfig的配置类注册
        ctx.register(WebMvcConfig.class);

        ctx.setServletContext(servletContext);

        ctx.refresh();
        //映射规则
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        registration.addMapping("/");
        registration.setLoadOnStartup(1);
    }
}
