package com.gf;


import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {
    @Test
    public void encode() {
        String pass = "admin";
        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
        String hashPass = bcryptPasswordEncoder.encode(pass);
        System.out.println(hashPass);

        boolean f = bcryptPasswordEncoder.matches("admin",hashPass);
        System.out.println(f);
    }
}
