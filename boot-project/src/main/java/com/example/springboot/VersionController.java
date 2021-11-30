package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController
{

	@Value("${app.version:unknown}")
	String version;

	@GetMapping(path = "/version", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getVersion()
	{
		return version;
	}


}
