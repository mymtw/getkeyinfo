package com.etsy.android.config.flags.events;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.g */
public final class C6360g implements C6350c {

    /* renamed from: a */
    public final String f14175a;

    public C6360g(String str) {
        C19383o.m32797g(str, "query");
        this.f14175a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6360g) && C19383o.m32792b(this.f14175a, ((C6360g) obj).f14175a);
    }

    public final int hashCode() {
        return this.f14175a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("FilterConfigFlags(query="), this.f14175a, ')');
    }
}
