package com.google.android.datatransport.runtime.scheduling.persistence;

import android.support.p013v4.media.C0072d;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;

final class AutoValue_PersistedEvent extends C6590h {
    private final C6547k event;

    /* renamed from: id */
    private final long f14545id;
    private final C6556p transportContext;

    public AutoValue_PersistedEvent(long j, C6556p pVar, C6547k kVar) {
        this.f14545id = j;
        if (pVar != null) {
            this.transportContext = pVar;
            if (kVar != null) {
                this.event = kVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6590h)) {
            return false;
        }
        C6590h hVar = (C6590h) obj;
        return this.f14545id == hVar.getId() && this.transportContext.equals(hVar.getTransportContext()) && this.event.equals(hVar.getEvent());
    }

    public C6547k getEvent() {
        return this.event;
    }

    public long getId() {
        return this.f14545id;
    }

    public C6556p getTransportContext() {
        return this.transportContext;
    }

    public int hashCode() {
        long j = this.f14545id;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.transportContext.hashCode()) * 1000003) ^ this.event.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PersistedEvent{id=");
        h.append(this.f14545id);
        h.append(", transportContext=");
        h.append(this.transportContext);
        h.append(", event=");
        h.append(this.event);
        h.append("}");
        return h.toString();
    }
}
