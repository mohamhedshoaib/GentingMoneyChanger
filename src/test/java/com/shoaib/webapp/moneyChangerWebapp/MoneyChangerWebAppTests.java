package com.shoaib.webapp.moneyChangerWebapp;

import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.shoaib.springBoot.model.Currency;
import com.shoaib.webapp.moneyChangerWebapp.moneyChangerWebapp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= moneyChangerWebapp.class,webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

public class MoneyChangerWebAppTests {

	@Test
	void contextLoads() {
	}
	
	@LocalServerPort
	private int port;
	
	public String BaseUrl = "http://localhost:"+port;
	
	TestRestTemplate testRestTemp = new TestRestTemplate();
	HttpHeaders httpHeader = new HttpHeaders();

	@Before
	public void before() {
		httpHeader.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	}

	@Test
	public void testSGDFromUSD() {
		
		String url = BaseUrl + "/get-USD/19000";
		System.out.println("Question 2 port is " + port);
		System.out.println("url  is " + url);
		//String output = testRestTemp.getForObject(url, String.class);
		
		httpHeader.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity entity = null;
		entity = new HttpEntity<String>(null,httpHeader);
		ResponseEntity<Currency> response = null;
		response = testRestTemp.exchange(url, HttpMethod.GET, entity, Currency.class);
		System.out.println("response  is " + response);
		System.out.println("response  is " + response.getBody());
//		String expected = "{id:1,name:SGD TO USD,exchnageRate:0.742164,exchangeAmount:14202.12}";
		//JSONAssert.assertEquals(expected, response.getBody(), false);
		//assertTrue(response.getBody().contains("id\":\"1"));
	}

	
	
}
