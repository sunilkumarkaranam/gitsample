package com.github.github;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atlassian.connect.spring.IgnoreJwt;

@RestController
public class GithubController {

	  @GetMapping("/helloworld")
      @IgnoreJwt
      public String helloworld() {
          return "github";
      }
	
}
