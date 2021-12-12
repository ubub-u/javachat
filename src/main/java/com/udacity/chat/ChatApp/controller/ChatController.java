package com.udacity.chat.ChatApp.controller;


import com.udacity.chat.ChatApp.ChatForm;
import com.udacity.chat.ChatApp.ChatMessage;
import com.udacity.chat.ChatApp.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {
    private MessageService messageService;
    private ChatMessage chatMessage;

    public ChatController(MessageService messageService, ChatMessage chatMessage) {
        this.messageService = messageService;
        this.chatMessage = chatMessage;
    }


    @GetMapping("/chat")
    public String getMessages(@ModelAttribute("newMessage") ChatForm chatForm, Model model){
        model.addAttribute("messages", this.messageService.getMessages());

        return "chat";
    }

    @PostMapping("/chat")
    public String postMessages(@ModelAttribute("newMessage") ChatForm newMessages,  Model model){
        messageService.addMessage(chatMessage.addItems(newMessages));
        chatMessage.clearList();
        model.addAttribute("messages", this.messageService.getMessages());
        return "/chat";
    }

}
