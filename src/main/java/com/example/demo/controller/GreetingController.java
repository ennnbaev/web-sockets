package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.model.HelloMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello/{chatId}")
    @SendTo("/topic/greetings/{chatId}")
    public Greeting greet(@DestinationVariable String chatId, HelloMessage message) {
        return new Greeting("Hello, " +
                HtmlUtils.htmlEscape(message.getName()));
    }
}
