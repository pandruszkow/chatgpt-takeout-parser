package parsegpt.jsonbeans.conversation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import parsegpt.jsonbeans.conversation.mapping.Mapping;

import java.util.Map;

@Data
public class Conversation {
    String title;
    Long create_time;
    Long update_time;
    Map<String, Mapping> mapping;
    @JsonIgnore
    Object moderation_results;
    @JsonIgnore
    Object current_node;
    String conversation_id;
    String conversation_template_id;
    String gizmo_id;
    Boolean is_archived;
    @JsonIgnore
    Object safe_urls;
    @JsonIgnore
    Object plugin_ids;
    String default_model_slug;
    @JsonIgnore
    Object conversation_origin;
    @JsonIgnore
    Object voice;
    @JsonIgnore
    Object async_status;
    String id;
}
