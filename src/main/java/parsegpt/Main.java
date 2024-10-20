package parsegpt;

import lombok.extern.slf4j.Slf4j;
import parsegpt.jsonbeans.conversation.Conversation;
import parsegpt.jsonbeans.conversation.mapping.Mapping;
import parsegpt.jsonbeans.conversation.metadata.Attachment;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.trace("Entering main");
        ConversationLoader conversationLoader = new ConversationLoader("takeout-data/conversations.json");
        Conversation[] conversations = conversationLoader.conversations;

        for (Conversation conversation : conversations){
            for(Mapping mapping : conversation.mapping.values()){

            }
        }
    }
}