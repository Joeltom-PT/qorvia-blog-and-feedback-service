package com.qorvia.blogfeedbackservice.dto.message;

import lombok.Data;

@Data
public class ValidateEventMessage {
    private String type = "validate-event";
    private String eventId;
}
