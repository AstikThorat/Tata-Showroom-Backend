package com.ts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ts.Service.LoginService;
import com.ts.model.Login;
import com.ts.model.Tata;

public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
    public Tata login(@RequestBody Login login) {
        return loginService.login(login.getEmailid(), login.getPassword());
    }
}
