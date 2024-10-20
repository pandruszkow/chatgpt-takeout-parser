package parsegpt.jsonbeans.conversation.mapping;

import lombok.Data;

@Data
public class Mapping {
    public String id;
    public Message message;
    public String parent;
    public String[] children;
}
