package com.dakor.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * .
 *
 * @author dkor
 */
@Configuration
@EnableAutoConfiguration
@SuppressWarnings("unused")
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		super.addViewControllers(registry);

		registry.addRedirectViewController("/", "/app");
		registry.addRedirectViewController("/app*", "/app");
	}
}
