package com.demo.SpringAI.Controller;

import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ollama")
@CrossOrigin("*")
public class OllamaController {

    private ChatClient chat;

    public OllamaController(OllamaChatModel chat) {
        this.chat = ChatClient.create(chat);
    }

    @GetMapping("{message}")
    public ResponseEntity<String> getMessage(@PathVariable String message){
        String response = chat.prompt(message).call().content();
        return ResponseEntity.ok(response);
    }
}
