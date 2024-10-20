package parsegpt.jsonbeans.conversation.metadata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Map;

@Data
public class Metadata {
    public Boolean is_visually_hidden_from_conversation;
    public Attachment[] attachments;
    public String request_id;
    public String message_source;
    public String timestamp_;
    public String message_type;
    public Object[] citations;
    public Object[] content_references;
    public String gizmo_id;
    public String model_slug;
    public String requested_model_slug;
    public String default_model_slug;
    public String parent_id;
    public FinishDetails finish_details;
    public Boolean is_complete;
    public Boolean is_user_system_message;
    public Map<String, String> user_context_message_data;
    public String finished_text;
    public String initial_text;
    public Long snorkle_status; //????? WHAT?
    public Boolean rebase_system_message;
    public String pad;
    public String command;
    public String status;
    public Boolean voice_mode_message;
    public Object _cite_metadata;
    public Object[] args;
    public Boolean real_time_audio_has_video;
    public Object serialization_metadata;
    @JsonIgnore
    public Object aggregate_result;
    public Map<String, String> kwargs;
    @JsonIgnore
    public Object ada_visualizations;
    public String[] model_adjustments;
    public String shared_conversation_id;
    @JsonIgnore
    public Object invoked_plugin;
    @JsonIgnore
    public Object jit_plugin_data;
    public Boolean filter_out_for_training;
    public Boolean filter_out_for_first_token_tracking;

    @Data
    public class FinishDetails {
        String type;
        String stop;
        Long[] stop_tokens;
    }
}
