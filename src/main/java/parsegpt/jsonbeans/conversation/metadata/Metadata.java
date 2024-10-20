package parsegpt.jsonbeans.conversation.metadata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Map;

@Data
public class Metadata {
    Boolean is_visually_hidden_from_conversation;
    Attachment[] attachments;
    String request_id;
    String message_source;
    String timestamp_;
    String message_type;
    Object[] citations;
    Object[] content_references;
    String gizmo_id;
    String model_slug;
    String requested_model_slug;
    String default_model_slug;
    String parent_id;
    FinishDetails finish_details;
    Boolean is_complete;
    Boolean is_user_system_message;
    Map<String, String> user_context_message_data;
    String finished_text;
    String initial_text;
    Long snorkle_status; //????? WHAT?
    Boolean rebase_system_message;
    String pad;
    String command;
    String status;
    Boolean voice_mode_message;
    Object _cite_metadata;
    Object[] args;
    Boolean real_time_audio_has_video;
    Object serialization_metadata;
    @JsonIgnore
    Object aggregate_result;
    Map<String, String> kwargs;
    @JsonIgnore
    Object ada_visualizations;
    String[] model_adjustments;
    String shared_conversation_id;
    @JsonIgnore
    Object invoked_plugin;
    @JsonIgnore
    Object jit_plugin_data;
    Boolean filter_out_for_training;
    Boolean filter_out_for_first_token_tracking;

    @Data
    public class FinishDetails {
        String type;
        String stop;
        Long[] stop_tokens;
    }
}
