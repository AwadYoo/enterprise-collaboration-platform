package com.ecp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/error").setViewName("error");
        registry.addViewController("/index").setViewName("index");
        //registry.addViewController("/news/newsList").setViewName("news/newsList");
        //registry.addViewController("/img/images").setViewName("img/images");
        //registry.addViewController("/user/userList").setViewName("user/userList");
        //registry.addViewController("/user/userAdd").setViewName("user/userAdd");
        //registry.addViewController("/user/userAdd").setViewName("user/userAdd");
        //registry.addViewController("/user/userInfo").setViewName("user/userInfo");
        //registry.addViewController("/sysManage/unitManage").setViewName("system/unitList");
        //registry.addViewController("/sysManage/unitAdd").setViewName("system/unitAdd");
        //registry.addViewController("/sysManage/tableManage").setViewName("system/tableList");
        //registry.addViewController("/sysManage/toTableConf").setViewName("system/tableAdd");
        //registry.addViewController("/dataManage/scada").setViewName("dataManage/scadaList");
        //registry.addViewController("/dataManage/metrics/data/toAdd").setViewName("dataManage/metricsDataAdd");
        //registry.addViewController("/dataManage/toScadaImport").setViewName("dataManage/scadaImport");
        //registry.addViewController("/dataManage/toScadaExport").setViewName("dataManage/scadaExport");
        //registry.addViewController("/dataManage/scadaChart").setViewName("dataManage/scadaChart");
        //registry.addViewController("/dataManage/pointData").setViewName("dataManage/pointData");
    }

    //@Override
    //public void addResourceHandlers(ResourceHandlerRegistry registry) {
    //    registry.addResourceHandler("/public/**").addResourceLocations("file:./static/", "classpath:/static/");
    //}

    @Bean
    public HttpPutFormContentFilter httpPutFormContentFilter() {
        return new HttpPutFormContentFilter();
    }

}
