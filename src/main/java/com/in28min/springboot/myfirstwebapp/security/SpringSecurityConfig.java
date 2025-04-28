package com.in28min.springboot.myfirstwebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfig {
    //LDAP or database to store id and passwords

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager(){

        UserDetails user1 = createNewUser("Swayam","abcd");
        UserDetails user2 = createNewUser("Rasik","1234");

        return new InMemoryUserDetailsManager(user1,user2);
    }

    private UserDetails createNewUser(String name, String password){
        Function<String, String> passEncoder
                = input -> passEncoder().encode(input);

        UserDetails userDetails1 = User
                .builder()
                .passwordEncoder(passEncoder)
                .username(name)
                .password(password)
                .roles("USER")
                .build();
        return userDetails1;
    }
    @Bean
    public PasswordEncoder passEncoder(){
        return new BCryptPasswordEncoder();
    }
}
