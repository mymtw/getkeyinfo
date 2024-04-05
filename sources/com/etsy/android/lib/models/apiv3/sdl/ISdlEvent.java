package com.etsy.android.lib.models.apiv3.sdl;

import java.util.Map;

public interface ISdlEvent {
    String getClientEventName();

    Map<String, Object> getClientEventProperties();

    String getClientEventTrigger();

    void setClientEventName(String str);

    void setClientEventProperties(Map<String, ? extends Object> map);

    void setClientEventTrigger(String str);
}
