package com.etsy.android.config.flags.events;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.s */
public final class C6373s implements C6350c {

    /* renamed from: a */
    public final String f14197a;

    public C6373s(String str) {
        C19383o.m32797g(str, "flagName");
        this.f14197a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6373s) && C19383o.m32792b(this.f14197a, ((C6373s) obj).f14197a);
    }

    public final int hashCode() {
        return this.f14197a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("SwitchConfigFlagClicked(flagName="), this.f14197a, ')');
    }
}
