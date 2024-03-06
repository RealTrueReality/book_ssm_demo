package com.itheima.config;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author TrueReality
 * @date 2022/12/27
 * @apiNote
 */
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        //@Override
        //protected Filter[] getServletFilters() {
        //    CharacterEncodingFilter characterEncodingFilter=new CharacterEncodingFilter();
        //    characterEncodingFilter.setEncoding("UTF-8");
        //    return new Filter[]{characterEncodingFilter};
        //}

        CharacterEncodingFilter characterEncodingFilter=new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        return new  Filter[]{characterEncodingFilter};
    }
}
