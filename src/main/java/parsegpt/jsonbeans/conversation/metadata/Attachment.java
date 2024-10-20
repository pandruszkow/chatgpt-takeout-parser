package parsegpt.jsonbeans.conversation.metadata;

import lombok.Data;

@Data
public class Attachment {
    String id;
    Long width;
    Long height;
    Long size;
    String name;
    String mime_type;
    String mimeType;
    Long fileSizeTokens;
    Long fileTokenSize;
    Long file_token_size;
    Long size_bytes;
    String url;
}
