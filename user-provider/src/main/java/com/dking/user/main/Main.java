package com.dking.user.main;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xinfei on 2018/7/5.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/service-common.xml");
        applicationContext.start();


            //PBEWithMD5AndDES
//            BasicTextEncryptor encryptor = new BasicTextEncryptor();
//            encryptor.setPassword("root123456");
//            String encrypted = encryptor.encrypt("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJUx7ok9nN+0TEiI4L+BlNPPc+NAqbgX9iVvX94o9rX7yMkrOLdHjwqb3I8g8WaTQO9sMDiEOHbylYo2LgKH8cMCAwEAAQ==");
//            System.out.println(encrypted);



        }
}
