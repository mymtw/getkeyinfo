package com.etsy.android.p327ui.conversation.details;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.conversation.details.k */
public final class C9531k {

    /* renamed from: a */
    public final String f21114a;

    /* renamed from: b */
    public final String f21115b;

    public C9531k(String str, String str2) {
        C19383o.m32797g(str, "userDisplayName");
        C19383o.m32797g(str2, "conversationId");
        this.f21114a = str;
        this.f21115b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9531k)) {
            return false;
        }
        C9531k kVar = (C9531k) obj;
        return C19383o.m32792b(this.f21114a, kVar.f21114a) && C19383o.m32792b(this.f21115b, kVar.f21115b);
    }

    public final int hashCode() {
        return this.f21115b.hashCode() + (this.f21114a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConversationNotification(userDisplayName=");
        h.append(this.f21114a);
        h.append(", conversationId=");
        return C0391c.m1057c(h, this.f21115b, ')');
    }
}
