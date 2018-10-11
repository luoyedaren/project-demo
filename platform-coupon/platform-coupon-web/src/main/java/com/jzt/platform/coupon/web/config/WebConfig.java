package com.jzt.platform.coupon.web.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter j = new MappingJackson2HttpMessageConverter();
        System.out.println("--jackson转换器--");
        ObjectMapper o = new ObjectMapper();
        SimpleModule s = new SimpleModule();
        s.addSerializer(Long.class, ToStringSerializer.instance);
        s.addSerializer(Long.TYPE, ToStringSerializer.instance);
        o.registerModule(s);
        j.setObjectMapper(o);
        converters.add(j);
    }
}