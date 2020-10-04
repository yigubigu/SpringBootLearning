package com.gf;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.DigestUtils;

public class DigesUtilsTest {

    @Test
    public void verify() {
        String password = "admin";
        String encrypted = DigestUtils.md5DigestAsHex(password.getBytes());

        String password2 = DigestUtils.md5DigestAsHex(password.getBytes());

        Assert.assertEquals(encrypted, password2);
        System.out.println(encrypted);
    }
}
