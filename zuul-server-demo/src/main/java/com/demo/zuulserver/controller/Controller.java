package com.demo.zuulserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(value = "/fetchUserName", method = RequestMethod.GET, produces = { "application/json" })
	public String fetchUserName(@RequestParam(value = "userId", required = true) int userId,
			@RequestParam(value = "transactionId", required = false) String transactionId) {

		String username;

		switch (userId) {
		case 1:
			username = "Tom";
			break;
		case 2:
			username = "Jack";
			break;
		case 3:
			username = "Brain";
			break;
		default:
			username = "No User Found";
			break;
		}

		return username;
	}

}
