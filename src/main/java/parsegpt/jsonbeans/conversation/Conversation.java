package parsegpt.jsonbeans.conversation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Setter;
import parsegpt.jsonbeans.conversation.mapping.Mapping;

import java.util.Map;

@Data
public class Conversation {
    public String title;
    public Long create_time;
    public Long update_time;
    public Map<String, Mapping> mapping;
    public Object[] moderation_results;
    public String current_node;
    public String conversation_id;
    public String conversation_template_id;
    public String gizmo_id;
    public Boolean is_archived;
    public String[] safe_urls;
    @JsonIgnore
    public Object plugin_ids;
    public String default_model_slug;
    @JsonIgnore
    public Object conversation_origin;
    @JsonIgnore
    public Object voice;
    @JsonIgnore
    public Object async_status;
    public String id;
}
