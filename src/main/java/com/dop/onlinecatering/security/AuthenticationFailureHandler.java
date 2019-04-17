package com.dop.onlinecatering.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(final HttpServletRequest request, final HttpServletResponse response, final AuthenticationException exception) throws IOException, ServletException {
        setDefaultFailureUrl("/login?error=true");

        super.onAuthenticationFailure(request, response, exception);
        String error = "hey";

        if (exception.getMessage().equalsIgnoreCase("User is disabled")) {
            error = "User is disabled";
        } else if (exception.getMessage().equalsIgnoreCase("User account has expired")) {
            error = "User account has expired";
        } else if (exception.getMessage().equalsIgnoreCase("blocked")) {
            error = "blocked";
        }

        request.getSession().setAttribute(WebAttributes.ACCESS_DENIED_403,error);
    }
}