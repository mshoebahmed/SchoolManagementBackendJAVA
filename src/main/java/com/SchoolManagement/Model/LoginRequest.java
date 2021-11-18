package com.SchoolManagement.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginRequest {

    @Value("${spring.security.user.name}")
	private String userName;

	@Value("${spring.security.user.password}")
	private String password;
    

    public String validateLogin(String username, String pwd) {
        if (username.equals(this.userName) && pwd.equals(this.password)) {
            return "true";
        } else {
            return "false";

        }

    }

}
