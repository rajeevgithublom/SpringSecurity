package com.icicilombard.jwtauth.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.beans.factory.annotation.Value;import org.springframework.data.auditing.config.IsNewAwareAuditingHandlerBeanDefinitionParser;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class JwtUtility {
	
	@Value("${jwt.secret}")
	private String secret;
	
	public String getToken(String subject)
	{
		
		return Jwts.builder()
				.setSubject(subject)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+ TimeUnit.MINUTES.toMillis(10)))
				.setIssuer("rajeev")
				.signWith(SignatureAlgorithm.HS256, secret.getBytes())
				.compact();
				
		
	}
	
	
	
	

}
