package com.google.android.datatransport.cct.internal;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;

final class AutoValue_LogResponse extends C6516k {
    private final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long j) {
        this.nextRequestWaitMillis = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6516k) {
            return this.nextRequestWaitMillis == ((C6516k) obj).getNextRequestWaitMillis();
        }
        return false;
    }

    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public int hashCode() {
        long j = this.nextRequestWaitMillis;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return C0087d.m236f(C0072d.m201h("LogResponse{nextRequestWaitMillis="), this.nextRequestWaitMillis, "}");
    }
}
