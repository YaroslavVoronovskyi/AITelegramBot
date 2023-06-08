package com.gmail.voronovskyi.yaroslav.aitelegrambot.client;

import com.gmail.voronovskyi.yaroslav.aitelegrambot.config.TelegramConfig;
import com.gmail.voronovskyi.yaroslav.aitelegrambot.contacts.Conversation;
import com.gmail.voronovskyi.yaroslav.aitelegrambot.helper.MessageParser;
import com.gmail.voronovskyi.yaroslav.aitelegrambot.persistent.RDS;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TelegramDelivery {

//    @Autowired
//    private MessageParser messageParser;
//    @Autowired
//    private RDS rds;

    TelegramBot bot = new TelegramBot(TelegramConfig.TOKEN);
//    List<Update> unreadMessagesList = new ArrayList<Update>();

    public void sendMessage(Conversation conversation, String rawMessage) {
        SendMessage sendRequest = new SendMessage(conversation.getChatId(), rawMessage);
        SendResponse sendResponse = bot.execute(sendRequest);

        if (sendResponse.isOk()) {
            System.out.println("ALL GOOD");
        } else {
            System.out.println("Could not send message at this moment.");
        }
    }

}
