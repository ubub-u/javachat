package com.udacity.chat.ChatApp.service;

import com.udacity.chat.ChatApp.ChatMessage;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageService {
    private List<List<String>> list;

    public MessageService() {
        this.list = new ArrayList<>();
    }

    public void addMessage(List<String> oldList){
        list.add(oldList);
    }

    public List<List<String>> getMessages(){
        return new ArrayList<>(this.list);
    }
}
