package com.huynguyenngocdang.commons.common;

import com.huynguyenngocdang.commons.utils.DateUtils;
import org.slf4j.MDC;

public record ResponseMetadata (String requestId, String requestDatetime, String responseDatetime){
    public static ResponseMetadata getCurrentMetadata() {
        return new ResponseMetadata(MDC.get("requestId"), MDC.get("requestDatetime"), DateUtils.getCurrentDatetime());
    }
}
