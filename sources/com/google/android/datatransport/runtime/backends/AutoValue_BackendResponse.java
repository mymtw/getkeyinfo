package com.google.android.datatransport.runtime.backends;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import com.google.android.datatransport.runtime.backends.BackendResponse;

final class AutoValue_BackendResponse extends BackendResponse {
    private final long nextRequestWaitMillis;
    private final BackendResponse.Status status;

    public AutoValue_BackendResponse(BackendResponse.Status status2, long j) {
        if (status2 != null) {
            this.status = status2;
            this.nextRequestWaitMillis = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.status.equals(backendResponse.getStatus()) && this.nextRequestWaitMillis == backendResponse.getNextRequestWaitMillis();
    }

    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public BackendResponse.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        long j = this.nextRequestWaitMillis;
        return ((this.status.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("BackendResponse{status=");
        h.append(this.status);
        h.append(", nextRequestWaitMillis=");
        return C0087d.m236f(h, this.nextRequestWaitMillis, "}");
    }
}
