package com.google.android.datatransport;

import android.support.p013v4.media.C0072d;

final class AutoValue_Event<T> extends C6494b<T> {
    private final Integer code;
    private final T payload;
    private final Priority priority;

    public AutoValue_Event(Integer num, T t, Priority priority2) {
        this.code = num;
        if (t != null) {
            this.payload = t;
            if (priority2 != null) {
                this.priority = priority2;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6494b)) {
            return false;
        }
        C6494b bVar = (C6494b) obj;
        Integer num = this.code;
        if (num != null ? num.equals(bVar.getCode()) : bVar.getCode() == null) {
            if (this.payload.equals(bVar.getPayload()) && this.priority.equals(bVar.getPriority())) {
                return true;
            }
        }
        return false;
    }

    public Integer getCode() {
        return this.code;
    }

    public T getPayload() {
        return this.payload;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        Integer num = this.code;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Event{code=");
        h.append(this.code);
        h.append(", payload=");
        h.append(this.payload);
        h.append(", priority=");
        h.append(this.priority);
        h.append("}");
        return h.toString();
    }
}
