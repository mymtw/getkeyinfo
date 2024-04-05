package com.google.android.datatransport.cct.internal;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.util.List;

final class AutoValue_BatchedLogRequest extends C6511h {
    private final List<C6514j> logRequests;

    public AutoValue_BatchedLogRequest(List<C6514j> list) {
        if (list != null) {
            this.logRequests = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6511h) {
            return this.logRequests.equals(((C6511h) obj).getLogRequests());
        }
        return false;
    }

    public List<C6514j> getLogRequests() {
        return this.logRequests;
    }

    public int hashCode() {
        return this.logRequests.hashCode() ^ 1000003;
    }

    public String toString() {
        return C0326j.m865j(C0072d.m201h("BatchedLogRequest{logRequests="), this.logRequests, "}");
    }
}
