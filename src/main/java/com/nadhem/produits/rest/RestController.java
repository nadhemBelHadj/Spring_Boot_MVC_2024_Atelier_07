package com.nadhem.produits.rest;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/auth")
	Authentication getAuth(Authentication auth)
	{
		return auth;
	}


}
