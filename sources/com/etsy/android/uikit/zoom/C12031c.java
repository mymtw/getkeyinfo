package com.etsy.android.uikit.zoom;

import android.support.p013v4.media.C0072d;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.zoom.c */
public final class C12031c {

    /* renamed from: a */
    public final boolean f26822a;

    /* renamed from: b */
    public final boolean f26823b;

    /* renamed from: c */
    public final Interpolator f26824c;

    public C12031c() {
        this(0);
    }

    public C12031c(int i) {
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        this.f26822a = true;
        this.f26823b = true;
        this.f26824c = accelerateDecelerateInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12031c)) {
            return false;
        }
        C12031c cVar = (C12031c) obj;
        return this.f26822a == cVar.f26822a && this.f26823b == cVar.f26823b && C19383o.m32792b(this.f26824c, cVar.f26824c);
    }

    public final int hashCode() {
        boolean z = this.f26822a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f26823b;
        if (!z3) {
            z2 = z3;
        }
        return this.f26824c.hashCode() + ((i + (z2 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ZoomConfig(isZoomAnimationEnabled=");
        h.append(this.f26822a);
        h.append(", isImmersiveModeEnabled=");
        h.append(this.f26823b);
        h.append(", interpolator=");
        h.append(this.f26824c);
        h.append(')');
        return h.toString();
    }
}
