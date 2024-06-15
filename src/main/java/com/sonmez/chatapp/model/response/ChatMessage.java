package com.sonmez.chatapp.model.response;

import com.sonmez.chatapp.model.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

     private String content;
     private String sender;
     private MessageType type;
}
