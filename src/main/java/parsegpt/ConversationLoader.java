package parsegpt;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import parsegpt.jsonbeans.conversation.Conversation;

import java.io.File;

@Slf4j
public class ConversationLoader {
    ObjectMapper mapper = new ObjectMapper();
    Conversation[] conversations = null;

    @SneakyThrows
    public ConversationLoader(String resourcePath) {
        var resName = "/" + resourcePath;
        var file = getClass().getResource(resName);
        var file2 = new File(file.toURI());
        Conversation[] conversations = mapper.readValue(file2, Conversation[].class);
        this.conversations = conversations;

        log.info(String.format("Found %d entries in loaded JSON file", conversations.length));
    }
}
