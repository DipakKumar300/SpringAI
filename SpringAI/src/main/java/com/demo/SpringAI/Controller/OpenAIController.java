package com.demo.SpringAI.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/openai")
@CrossOrigin("*")
public class OpenAIController {

   /* private OpenAiChatModel chat;

    public OpenAIController(OpenAiChatModel chat) {
        this.chat = chat;
    }

    @GetMapping("{message}")
    public ResponseEntity<String> getMessage(@PathVariable String message){
        String response = chat.call(message);
        return ResponseEntity.ok(response);
    }*/
}
