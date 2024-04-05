package com.etsy.android.config.flags.events;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.o */
public final class C6368o implements C6350c {

    /* renamed from: a */
    public final String f14193a;

    public C6368o(String str) {
        this.f14193a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6368o) && C19383o.m32792b(this.f14193a, ((C6368o) obj).f14193a);
    }

    public final int hashCode() {
        String str = this.f14193a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("QueryTextSubmitted(query="), this.f14193a, ')');
    }
}
