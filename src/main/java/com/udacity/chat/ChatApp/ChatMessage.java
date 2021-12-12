package com.udacity.chat.ChatApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatMessage {
    public List<String> UsernameMessage;


    public ChatMessage() {
        this.UsernameMessage = new ArrayList<>();
    }



    public List<String> addItems(ChatForm newMessage){
        UsernameMessage.add(newMessage.getUsername());
        UsernameMessage.add(newMessage.getMessage());
        return UsernameMessage;
    }

    public void clearList(){
        UsernameMessage = new ArrayList<>();
    }

    public List<String> getItems(){
       return UsernameMessage;
    }
}
