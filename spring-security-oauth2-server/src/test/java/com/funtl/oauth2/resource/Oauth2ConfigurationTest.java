package com.funtl.oauth2.resource;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/27 20:53
 **/
public class Oauth2ConfigurationTest {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
