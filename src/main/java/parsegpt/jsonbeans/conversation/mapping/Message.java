package parsegpt.jsonbeans.conversation.mapping;

import lombok.Data;
import parsegpt.jsonbeans.conversation.Role;
import parsegpt.jsonbeans.conversation.metadata.Metadata;

@Data
public class Message {
    public String id;
    public Author author;
    public Long create_time;
    public Long update_time;
    public Content content;
    public Status status;
    public Boolean end_turn;
    public Double weight;
    public Metadata metadata;
    public String recipient;
    public String channel;
    public String parent;
    public String[] children;

    @Data
    public class Author {
        Role role;
        String name;
        Metadata metadata;
    }
    @Data
    public class Content {
        ContentType content_type;
        Object[] parts;
        String result;
        String summary;
        Object[] assets;
        String tether_id;
        String url;
        String domain;
        String text;
        String title;
        String language;
        String name;
        String response_format_name;

        public enum ContentType {
            text,
            multimodal_text,
            tether_browsing_display,
            tether_quote,
            code,
            execution_output,
            system_error,

        }
    }
    public enum Status {
        finished_successfully,
        in_progress,
        finished_partial_completion,

    }
}
