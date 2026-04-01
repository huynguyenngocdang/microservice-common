package com.huynguyenngocdang.commons.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtils {
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final ZoneId VIETNAM_ZONE_ID = ZoneId.of("Asia/Ho_Chi_Minh");

    public static String getCurrentDatetime() {
        LocalDateTime now = LocalDateTime.now(VIETNAM_ZONE_ID);
        return now.format(DateTimeFormatter.ofPattern(DATE_TIME_FORMAT));
    }
}
