package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class DelegateSdlEvent implements ISdlEvent {
    public static final int $stable = 8;
    private String clientEventName;
    private Map<String, ? extends Object> clientEventProperties;
    private String clientEventTrigger;

    public DelegateSdlEvent() {
        this((String) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public DelegateSdlEvent(@C17402n(name = "client_event_name") String str, @C17402n(name = "client_event_trigger") String str2, @C17402n(name = "client_event_properties") Map<String, ? extends Object> map) {
        C19383o.m32797g(str, "clientEventName");
        C19383o.m32797g(str2, "clientEventTrigger");
        this.clientEventName = str;
        this.clientEventTrigger = str2;
        this.clientEventProperties = map;
    }

    public static /* synthetic */ DelegateSdlEvent copy$default(DelegateSdlEvent delegateSdlEvent, String str, String str2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = delegateSdlEvent.getClientEventName();
        }
        if ((i & 2) != 0) {
            str2 = delegateSdlEvent.getClientEventTrigger();
        }
        if ((i & 4) != 0) {
            map = delegateSdlEvent.getClientEventProperties();
        }
        return delegateSdlEvent.copy(str, str2, map);
    }

    public final String component1() {
        return getClientEventName();
    }

    public final String component2() {
        return getClientEventTrigger();
    }

    public final Map<String, Object> component3() {
        return getClientEventProperties();
    }

    public final DelegateSdlEvent copy(@C17402n(name = "client_event_name") String str, @C17402n(name = "client_event_trigger") String str2, @C17402n(name = "client_event_properties") Map<String, ? extends Object> map) {
        C19383o.m32797g(str, "clientEventName");
        C19383o.m32797g(str2, "clientEventTrigger");
        return new DelegateSdlEvent(str, str2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DelegateSdlEvent)) {
            return false;
        }
        DelegateSdlEvent delegateSdlEvent = (DelegateSdlEvent) obj;
        return C19383o.m32792b(getClientEventName(), delegateSdlEvent.getClientEventName()) && C19383o.m32792b(getClientEventTrigger(), delegateSdlEvent.getClientEventTrigger()) && C19383o.m32792b(getClientEventProperties(), delegateSdlEvent.getClientEventProperties());
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

    public int hashCode() {
        return ((getClientEventTrigger().hashCode() + (getClientEventName().hashCode() * 31)) * 31) + (getClientEventProperties() == null ? 0 : getClientEventProperties().hashCode());
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

    public String toString() {
        StringBuilder h = C0072d.m201h("DelegateSdlEvent(clientEventName=");
        h.append(getClientEventName());
        h.append(", clientEventTrigger=");
        h.append(getClientEventTrigger());
        h.append(", clientEventProperties=");
        h.append(getClientEventProperties());
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DelegateSdlEvent(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C19294b0.m32559p0() : map);
    }
}
