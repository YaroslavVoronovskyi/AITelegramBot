package com.gmail.voronovskyi.yaroslav.aitelegrambot.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TelegramConfig {

    public static final String BASE_URL = "https://api.telegram.org";
    public static final String BOT_PREFIX = "bot";
    public static final String TOKEN = "";
    public static final String MESSAGE_SENT = "SENT\t";
    public static final String MESSAGE_RECEIVED = "RECEIVED\t";
}
