package com.inci.onlineAcademy.core.utilities.messages;

public interface MessageService {
    String getMessage(String keyword);
    String getMessageWithParams(String keyword, Object... params);
}
