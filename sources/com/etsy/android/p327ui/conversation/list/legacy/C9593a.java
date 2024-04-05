package com.etsy.android.p327ui.conversation.list.legacy;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.a */
public final class C9593a {

    /* renamed from: a */
    public final int f21274a;

    /* renamed from: b */
    public final int f21275b;

    public C9593a(int i, int i2) {
        this.f21274a = i;
        this.f21275b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9593a)) {
            return false;
        }
        C9593a aVar = (C9593a) obj;
        return this.f21274a == aVar.f21274a && this.f21275b == aVar.f21275b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21275b) + (Integer.hashCode(this.f21274a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConversationListSpec(offset=");
        h.append(this.f21274a);
        h.append(", limit=");
        return C0073e.m208h(h, this.f21275b, ')');
    }
}
