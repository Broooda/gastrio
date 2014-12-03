package com.io.gastrIO.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * Klasa definiująca ziarna zwiazane z konfiguracją.
 */
@Configuration
@ComponentScan(basePackages = {"com.io.gastrIO"})
public class RootConfig {
    /**
     * Ziarno zawierajace sciezki do plikow zasobow.
     *
     * @return obiekt PropertyPlaceholderConfigurer zawierajacy sciezki do
     *         plikow properties
     */
    @Bean
    public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        Resource[] locations = new Resource[1];
        locations[0] = new ClassPathResource("/messages.properties");
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocations(locations);
        return ppc;
    }
}