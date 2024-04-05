package com.braze.events;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p030bo.app.C3570b0;
import p030bo.app.C3769i0;
import p030bo.app.C4276x3;
import p030bo.app.C4296y1;

public final class BrazeNetworkFailureEvent {

    /* renamed from: a */
    public final Exception f11705a;

    /* renamed from: b */
    public final C4296y1 f11706b;

    public enum RequestType {
        CONTENT_CARDS_SYNC,
        NEWS_FEED_SYNC,
        OTHER
    }

    public BrazeNetworkFailureEvent(Exception exc, C4296y1 y1Var) {
        C19383o.m32797g(y1Var, "brazeRequest");
        this.f11705a = exc;
        this.f11706b = y1Var;
        exc.getMessage();
        y1Var.mo13970j();
        if (y1Var instanceof C3570b0) {
            RequestType requestType = RequestType.CONTENT_CARDS_SYNC;
        } else if (y1Var instanceof C3769i0) {
            C4276x3 c = y1Var.mo13433c();
            boolean z = true;
            if ((c == null || !c.mo14164x()) ? false : z) {
                RequestType requestType2 = RequestType.CONTENT_CARDS_SYNC;
            } else {
                RequestType requestType3 = RequestType.CONTENT_CARDS_SYNC;
            }
        } else {
            RequestType requestType4 = RequestType.CONTENT_CARDS_SYNC;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeNetworkFailureEvent)) {
            return false;
        }
        BrazeNetworkFailureEvent brazeNetworkFailureEvent = (BrazeNetworkFailureEvent) obj;
        return C19383o.m32792b(this.f11705a, brazeNetworkFailureEvent.f11705a) && C19383o.m32792b(this.f11706b, brazeNetworkFailureEvent.f11706b);
    }

    public final int hashCode() {
        return this.f11706b.hashCode() + (this.f11705a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BrazeNetworkFailureEvent(originalException=");
        h.append(this.f11705a);
        h.append(", brazeRequest=");
        h.append(this.f11706b);
        h.append(')');
        return h.toString();
    }
}
