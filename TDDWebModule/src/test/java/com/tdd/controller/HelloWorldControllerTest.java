package com.tdd.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class HelloWorldControllerTest {

	HelloWorldController controller;
	
	@Before
	public void setUp() {
		controller = new HelloWorldController();
	}

	@Test
	public void weGetHelloWorldBackAsAResponse() {
		assertThat(controller.defaultResponse(), is("simple"));
	}
	
	@Test
	public void simpleWebServiceCall() {
		assertThat(controller.echoRequest("random"), is("random"));
	}
	
	@Test
	public void simpleDifferentWebServiceCall() {
		assertThat(controller.echoRequest("other"), is("other"));
	}
}
