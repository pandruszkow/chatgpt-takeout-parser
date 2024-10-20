package parsegpt.jsonbeans.conversation.metadata;

import lombok.Data;

@Data
public class Attachment {
    public String id;
    public Long width;
    public Long height;
    public Long size;
    public String name;
    public String mime_type;
    public String mimeType;
    public Long fileSizeTokens;
    public Long fileTokenSize;
    public Long file_token_size;
    public Long size_bytes;
    public String url;
}
