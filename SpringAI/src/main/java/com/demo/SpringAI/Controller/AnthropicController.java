package com.demo.SpringAI.Controller;

import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/anthropic")
@CrossOrigin("*")
public class AnthropicController {

/*    private AnthropicChatModel chat;

    public AnthropicController(AnthropicChatModel chat) {
        this.chat = chat;
    }

    @GetMapping("{message}")
    public ResponseEntity<String> getMessage(@PathVariable String message){
        String response = chat.call(message);
        return ResponseEntity.ok(response);
    }*/

    // Second approach to implement and it is better then first one.

    /*private ChatClient chat;

    public AnthropicController(AnthropicChatModel chat) {
        this.chat = ChatClient.create(chat);
    }

    @GetMapping("{message}")
    public ResponseEntity<String> getMessage(@PathVariable String message){
        String response = chat.prompt(message).call().content();
        return ResponseEntity.ok(response);
    }*/
}
