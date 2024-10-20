package parsegpt.jsonbeans.conversation.mapping;

import lombok.Data;

@Data
public class Mapping {
    String id;
    Message message;
    String parent;
    String[] children;
}
