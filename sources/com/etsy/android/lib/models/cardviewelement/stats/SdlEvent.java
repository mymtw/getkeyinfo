package com.etsy.android.lib.models.cardviewelement.stats;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.sdl.ISdlEvent;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SdlEvent extends BaseFieldModel implements ISdlEvent {
    public static final int $stable = 8;
    private static final String CLIENT_EVENT_NAME = "client_event_name";
    private static final String CLIENT_EVENT_PROPERTIES = "client_event_properties";
    private static final String CLIENT_EVENT_TRIGGER = "client_event_trigger";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private String clientEventName = "";
    private Map<String, ? extends Object> clientEventProperties = C19294b0.m32559p0();
    private String clientEventTrigger = "";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public String getClientEventName() {
        return this.clientEventName;
    }

    public Map<String, Object> getClientEventProperties() {
        return this.clientEventProperties;
    }

    public String getClientEventTrigger() {
        return this.clientEventTrigger;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != -955451900) {
            if (c != -399455764) {
                if (c == 393935775 && str.equals(CLIENT_EVENT_TRIGGER)) {
                    setClientEventTrigger(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
            } else if (str.equals(CLIENT_EVENT_PROPERTIES)) {
                setClientEventProperties((Map) jsonParser.readValueAs((TypeReference<?>) new SdlEvent$parseField$1()));
                return true;
            }
        } else if (str.equals(CLIENT_EVENT_NAME)) {
            setClientEventName(BaseModel.Companion.parseString(jsonParser));
            return true;
        }
        return false;
    }

    public void setClientEventName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.clientEventName = str;
    }

    public void setClientEventProperties(Map<String, ? extends Object> map) {
        this.clientEventProperties = map;
    }

    public void setClientEventTrigger(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.clientEventTrigger = str;
    }
}
