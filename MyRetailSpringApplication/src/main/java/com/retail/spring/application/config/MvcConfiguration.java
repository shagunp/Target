package com.retail.spring.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.retail.spring.application.dao.ProductDAO;
import com.retail.spring.application.dao.impl.ProductDAOImpl;
import com.retail.spring.application.service.ProductService;
import com.retail.spring.application.service.impl.ProductServiceImpl;


@Configuration
@ComponentScan(basePackages="com.retail.spring.application")
@EnableWebMvc

public class MvcConfiguration  implements WebMvcConfigurer {

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	
	
	public @Bean MongoClient mongoClient() {
	       return MongoClients.create("mongodb://localhost:27017");
    }

	@Bean
	public MongoOperations mongoTemplate() throws Exception {
		
	    return new MongoTemplate(mongoClient(), "productdb");
	}
	
	@Bean
	public MongoOperations mongoOperations() throws Exception {
		return mongoTemplate();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(getClientHttpRequestFactory());
	}

	private SimpleClientHttpRequestFactory getClientHttpRequestFactory() 
	{
		SimpleClientHttpRequestFactory clientHttpRequestFactory
                      = new SimpleClientHttpRequestFactory();
		//Connect timeout
		clientHttpRequestFactory.setConnectTimeout(10_000);
     
		//Read timeout
		clientHttpRequestFactory.setReadTimeout(10_000);
		return clientHttpRequestFactory;
	}
	@Bean
	public ProductDAO getProductDAO() throws Exception {
		return new ProductDAOImpl();
	}
	@Bean
	public ProductService getProductService() throws Exception {
		return new ProductServiceImpl();
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
}
