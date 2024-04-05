package com.google.android.datatransport.runtime.backends;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.backends.C6527c;
import java.util.Arrays;

final class AutoValue_BackendRequest extends C6527c {
    private final Iterable<C6547k> events;
    private final byte[] extras;

    public static final class Builder extends C6527c.C6528a {
        private Iterable<C6547k> events;
        private byte[] extras;

        public C6527c build() {
            String str = this.events == null ? " events" : "";
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.events, this.extras);
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public C6527c.C6528a setEvents(Iterable<C6547k> iterable) {
            if (iterable != null) {
                this.events = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public C6527c.C6528a setExtras(byte[] bArr) {
            this.extras = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6527c)) {
            return false;
        }
        C6527c cVar = (C6527c) obj;
        if (this.events.equals(cVar.getEvents())) {
            if (Arrays.equals(this.extras, cVar instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) cVar).extras : cVar.getExtras())) {
                return true;
            }
        }
        return false;
    }

    public Iterable<C6547k> getEvents() {
        return this.events;
    }

    public byte[] getExtras() {
        return this.extras;
    }

    public int hashCode() {
        return ((this.events.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("BackendRequest{events=");
        h.append(this.events);
        h.append(", extras=");
        h.append(Arrays.toString(this.extras));
        h.append("}");
        return h.toString();
    }

    private AutoValue_BackendRequest(Iterable<C6547k> iterable, byte[] bArr) {
        this.events = iterable;
        this.extras = bArr;
    }
}
