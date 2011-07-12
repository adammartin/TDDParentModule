package com.tdd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String defaultResponse() {
		return "simple";
	}

	@RequestMapping("/{responseToEcho}")
	@ResponseBody
	public String echoRequest(@PathVariable String responseToEcho) {
		return responseToEcho;
	}
}
