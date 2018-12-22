package com.t9vg.api;

import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author 94946
 */
@Configuration
public class FreeMarkerConfig {

    @Autowired
    private freemarker.template.Configuration configuration;

    @Value("${server.context-path}")
    private String basePath;

    @PostConstruct
    public void init() throws TemplateModelException {
        if ("/".equals(basePath)) {
            basePath = "";
        }
        configuration.setSharedVariable("basePath", basePath);
        configuration.setSharedVariable("ctx", basePath);
    }

}
