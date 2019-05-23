package com.KERAD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class GameWebPlatform {

    public static void main(String[] args) {
        SpringApplication.run(GameWebPlatform.class, args);
    }
}

