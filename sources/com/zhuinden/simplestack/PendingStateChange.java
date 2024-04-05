package com.zhuinden.simplestack;

import android.support.p013v4.media.C0072d;
import java.util.AbstractList;
import java.util.List;

public final class PendingStateChange {

    /* renamed from: a */
    public final List<?> f38312a;

    /* renamed from: b */
    public final int f38313b;

    /* renamed from: c */
    public final boolean f38314c;

    /* renamed from: d */
    public final boolean f38315d;

    /* renamed from: e */
    public Status f38316e = Status.ENQUEUED;

    /* renamed from: f */
    public C17531h f38317f;

    /* renamed from: g */
    public boolean f38318g = false;

    public enum Status {
        ENQUEUED,
        IN_PROGRESS,
        COMPLETED
    }

    public PendingStateChange(AbstractList abstractList, int i, boolean z, boolean z2) {
        this.f38312a = abstractList;
        this.f38313b = i;
        this.f38314c = z;
        this.f38315d = z2;
    }

    /* renamed from: a */
    public final void mo68694a(Status status) {
        if (status == null) {
            throw new NullPointerException("Status of pending state change cannot be null!");
        } else if (status.ordinal() >= this.f38316e.ordinal()) {
            this.f38316e = status;
        } else {
            StringBuilder h = C0072d.m201h("A pending state change cannot go to one of its previous states: [");
            h.append(this.f38316e);
            h.append("] to [");
            h.append(status);
            h.append("]");
            throw new IllegalStateException(h.toString());
        }
    }
}
