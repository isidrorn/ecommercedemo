package com.ndtx.ecommercedemo;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = EcommerceDemoApplication.class)
@AutoConfigureMockMvc
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)

class EcommerceDemoApplicationTests {

	private static final String PRODUCTS_PATH = "/products";

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void test1() throws Exception {
		mockMvc.perform(get(PRODUCTS_PATH + "?productId=35455&brandId=1&startDate=2020-06-14-10.00.00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(equalTo(1))));
	}

	@Test
	public void test2() throws Exception {
		mockMvc.perform(get(PRODUCTS_PATH + "?productId=35455&brandId=1&startDate=2020-06-14-16.00.00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(equalTo(2))));
	}
	
	@Test
	public void test3() throws Exception {
		mockMvc.perform(get(PRODUCTS_PATH + "?productId=35455&brandId=1&startDate=2020-06-14-21.00.00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(equalTo(2))));
	}
	
	@Test
	public void test4() throws Exception {
		mockMvc.perform(get(PRODUCTS_PATH + "?productId=35455&brandId=1&startDate=2020-06-15-10.00.00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(equalTo(3))));
	}
	
	@Test
	public void test5() throws Exception {
		mockMvc.perform(get(PRODUCTS_PATH + "?productId=35455&brandId=1&startDate=2020-06-16-21.00.00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
		.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$", hasSize(equalTo(4))));
	}
}
