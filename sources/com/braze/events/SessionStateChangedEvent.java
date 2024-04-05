package com.braze.events;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

public final class SessionStateChangedEvent {

    /* renamed from: a */
    public final String f11707a;

    /* renamed from: b */
    public final ChangeType f11708b;

    public enum ChangeType {
        SESSION_STARTED,
        SESSION_ENDED
    }

    public SessionStateChangedEvent(String str, ChangeType changeType) {
        C19383o.m32797g(str, "sessionId");
        C19383o.m32797g(changeType, "eventType");
        this.f11707a = str;
        this.f11708b = changeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionStateChangedEvent)) {
            return false;
        }
        SessionStateChangedEvent sessionStateChangedEvent = (SessionStateChangedEvent) obj;
        return C19383o.m32792b(this.f11707a, sessionStateChangedEvent.f11707a) && this.f11708b == sessionStateChangedEvent.f11708b;
    }

    public final int hashCode() {
        return this.f11708b.hashCode() + (this.f11707a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SessionStateChangedEvent{sessionId='");
        h.append(this.f11707a);
        h.append("', eventType='");
        h.append(this.f11708b);
        h.append("'}'");
        return h.toString();
    }
}
