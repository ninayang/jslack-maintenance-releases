package com.github.seratch.jslack.api.methods.response.admin.conversations;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.ErrorResponseMetadata;
import lombok.Data;

@Data
public class AdminConversationsSetTeamsResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String channel; // channel id
    private ErrorResponseMetadata responseMetadata;
}